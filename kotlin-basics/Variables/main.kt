fun main() {
    var mutableVariable = 10
    val immutableVariable = 20

    println("Initial values: $mutableVariable, $immutableVariable")

    mutableVariable = 15
    immutableVariable = 25 // This will give an error

    println("Updated values: $mutableVariable, $immutableVariable")
}