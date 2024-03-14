fun Int.isEven(): Boolean {
  return this % 2 == 0
}

fun main() {
  val number = 10
  println("Is $number even? ${number.isEven()}")

  val anotherNumber = 7
  println("Is $anotherNumber even? ${anotherNumber.isEven()}")
}