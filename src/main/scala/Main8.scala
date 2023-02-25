
object Main8 {

  def run() = {
    val foo = Foo()
    val bar = Bar()

    val setCounterpartyDefaults = List(foo, bar).map {
      case s: MayMarkCounterpartyDefaultsAsSet[_] => true
      case _: NegotiationState[_] => false
    }

    println("SCPD = " + setCounterpartyDefaults)
  }
}

