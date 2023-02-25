
object Main extends App {

  val foo: NegotiationState[_] = Foo()
  val bar: NegotiationState[_] = Bar()

  Main1.run()
  Main2.run()
  Main3.run()
  Main4.run()
  Main5.run()
  Main6.run()
  Main7.run()
  Main8.run()
  Main9.run()
  Main10.run()

  val setCounterpartyDefaults = List(foo, bar).map {
    case s: MayMarkCounterpartyDefaultsAsSet[_] => true
    case _: NegotiationState[_] => false
  }

  println("SCPD = " + setCounterpartyDefaults)
}


