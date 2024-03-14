sealed class Shape {
    class Circle(val radius: Double) : Shape()
    class Rectangle(val width: Double, val height: Double) : Shape()
    class Square(val side: Double) : Shape()
}

fun calculateArea(shape: Shape): Double {
    return when (shape) {
        is Shape.Circle -> Math.PI * shape.radius * shape.radius
        is Shape.Rectangle -> shape.width * shape.height
        is Shape.Square -> shape.side * shape.side
    }
}

fun main() {
    val circle = Shape.Circle(5.0)
    val rectangle = Shape.Rectangle(3.0, 4.0)
    val square = Shape.Square(5.0)
    
    println("Circle Area: ${calculateArea(circle)}")
    println("Rectangle Area: ${calculateArea(rectangle)}")
    println("Square Area: ${calculateArea(square)}")
}