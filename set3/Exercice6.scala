object Exercice6 {
  def main(args: Array[String]): Unit = {
    /**
     * Function to perform arithmetic operations based on input operation string.
     * @param operationType A string specifying the operation ("addition", "soustraction", "product", "division").
     * @param num1 First integer operand.
     * @param num2 Second integer operand.
     * @return Result of the operation.
     */
    def operation(operationType: String, num1: Int, num2: Int): Option[Int] = {
      operationType match {
        case "addition" => Some(num1 + num2)
        case "soustraction" => Some(num1 - num2)
        case "product" => Some(num1 * num2)
        case "division" =>
          if (num2 != 0) Some(num1 / num2) else None
        case _ => None // Invalid operation type
      }
    }

    // Example operations
    val result1 = operation("addition", 5, 3)
    val result2 = operation("soustraction", 10, 4)
    val result3 = operation("product", 7, 2)
    val result4 = operation("division", 12, 3)
    val result5 = operation("division", 8, 0) // Division by zero example
    val result6 = operation("unknown", 5, 3) // Invalid operation type example

    // Display the result
    println("----- Exercice 6 -----")
    println("Displaying result: ")
    // Display the results
    println("Results of operations:")
    println(s"Addition result: $result1")
    println(s"Soustraction result: $result2")
    println(s"Product result: $result3")
    println(s"Division result: $result4")
    println(s"Division by zero result: $result5")
    println(s"Unknown operation result: $result6")
  }
}

/**
* To compile:     scalac Exercice6.scala
* To run:         scala Exercice6
*/