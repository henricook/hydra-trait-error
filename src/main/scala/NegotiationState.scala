case class Foo() extends EditableAnswersState[String] with MayMarkCounterpartyDefaultsAsSet[String] {}

case class Bar() extends EditableAnswersState[Int]

sealed trait NegotiationState[A] extends Product with Serializable

sealed trait NonFinalNegotiationState[A] extends NegotiationState[A]

sealed trait EditableAnswersState[A] extends NonFinalNegotiationState[A]

sealed trait MayMarkCounterpartyDefaultsAsSet[A] {
  self: EditableAnswersState[A] =>
}
