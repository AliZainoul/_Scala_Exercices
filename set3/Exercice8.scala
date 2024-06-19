object Exercice8 {
  // Define case classes for geometric shapes
  case class Circle(radius: Double)
  case class Square(sideLength: Double)
  case class Rectangle(width: Double, height: Double)

  def main(args: Array[String]): Unit = {
    /**
     * Function to recognize and describe a geometric shape using pattern matching.
     * @param shape A geometric shape represented as a case class (Circle, Square, Rectangle).
     * @return A string describing the shape.
     */
    def recognizeForm(shape: Any): String = {
      shape match {
        case Circle(radius) => s"Circle with radius $radius"
        case Square(sideLength) => s"Square with side length $sideLength"
        case Rectangle(width, height) => s"Rectangle with width $width and height $height"
        case _ => "Unknown shape"
      }
    }

    // Example shapes
    val circle = Circle(5.0)
    val square = Square(7.0)
    val rectangle = Rectangle(4.0, 6.0)
    val unknownShape = "Triangle" // Example of an unknown shape

    // Function Calls
    val result1 = recognizeForm(circle)
    val result2 = recognizeForm(square)
    val result3 = recognizeForm(rectangle)
    val result4 = recognizeForm(unknownShape)

    // Display the result
    println("----- Exercice 8 -----")
    println("Displaying result: ")
    // Display the results
    println(s"Shape $circle: $result1")
    println(s"Shape $square: $result2")
    println(s"Shape $rectangle: $result3")
    println(s"Shape $unknownShape: $result4")
  }
}

/**
* To compile:     scalac Exercice8.scala
* To run:         scala Exercice8
*/