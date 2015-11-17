package warts

object Foo {
  case class StateObject(opt: Option[Int] = None)
  def state: StateObject = StateObject()

  // println(state.opt.get) // does error

  {
    (1: Any) match {
      case e => println(state.opt.get) // doesn't error
    }
  }

  (1: Any) match {
    case e: Int => {
      println(state.opt.get) // doesn't error
    }
    case _ => // nothing
  }

  (1: Any) match {
    case e: Int => {
      if (false) {
        println("thing")
      } else {
        println(state.opt.get) // doesn't error
      }
    }
    case _ => // nothing
  }
}
