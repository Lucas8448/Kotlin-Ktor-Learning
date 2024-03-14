open class Animal(val name: String) {
  open fun makeSound() {
    println("$name makes a sound.")
  }
}

class Dog(name: String) : Animal(name) {
  override fun makeSound() {
    println("$name barks.")
  }
}

class Cat(name: String) : Animal(name) {
  override fun makeSound() {
    println("$name meows.")
  }
}

class Horse(name: String) : Animal(name)

fun main() {
  val dog = Dog("Angel")
  val cat = Cat("Uno")
  val horse = Horse("Pegasus")
  
  dog.makeSound()
  cat.makeSound()
  horse.makeSound()
}