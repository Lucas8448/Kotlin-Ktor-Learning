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

fun main() {
    val animals = arrayOf(
        Dog("Angel"),
        Cat("Uno"),
        Dog("Lola")
    )

    for (animal in animals) {
        animal.makeSound()
    }
}