name := "wartremover-option-bug"

scalaVersion := "2.10.5"

wartremoverErrors in (Compile, compile) ++= Warts.allBut(
  Wart.Any, // actors
  Wart.NoNeedForMonad, // compiler crash
  Wart.DefaultArguments,
  Wart.FinalCaseClass
)

// wartremoverErrors in (Compile, compile) ++= Warts.allBut(
//

//   Wart.Enumeration, // sealed case classes are roughly equal
//   Wart.Option2Iterable, // option -> iterable isn't a huge deal breaker
//   Wart.Nothing, // this is more for convenience and explicit code
//   Wart.NonUnitStatements, // this doesn't help explain why side effects are bad

//   // pattern matching causes these to trigger a lot
//   Wart.AsInstanceOf,
//   Wart.IsInstanceOf,

//   // lowered to warnings
//   Wart.Null,

//   // todo: These would be good to cleanup
//   Wart.FinalCaseClass, Wart.ToString, Wart.DefaultArguments, Wart.Throw
// )

// wartremoverWarnings ++= Seq(Wart.Null, Wart.Nothing)
