class Person(val name: String, var age: Int) {
  fun introduce() {
    println("Hello, my name is $name and I am $age years old.")
  }

  fun birthday() {
    age++
    println("$name just had a birthday! They are now $age years old.")
  }
}

fun main() {
  val person1 = Person("Alice", 30)
  val person2 = Person("Bob", 25)

  person1.introduce()
  person2.introduce()

  person1.birthday()

  person1.introduce()
  person2.introduce()
}