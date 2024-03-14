fun main() {
    val number1 = 10
    val number2 = 5

    println("Addition result: ${add(number1, number2)}")
    println("Subtraction result: ${subtract(number1, number2)}")
    println("Multiplication result: ${multiply(number1, number2)}")
    println("Division result: ${divide(number1, number2)}")
}

fun add(a: Int, b: Int): Int {
    return a + b
}

fun subtract(a: Int, b: Int): Int {
    return a - b
}

fun multiply(a: Int, b: Int): Int {
    return a * b
}

fun divide(a: Int, b: Int): Double {
    if (b == 0) {
        println("Error: Division by zero")
        return Double.NaN
    }
    return a.toDouble() / b
}