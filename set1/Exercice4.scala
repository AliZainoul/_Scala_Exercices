object Exercice4 {
  def main(args: Array[String]): Unit = {
    /**
     * Function to calculate the product of all elements in a list.
     * @param numbers A list of integers.
     * @return The product of all elements.
     */
    def listProduct(numbers: List[Int]): Int = {
      // Compute the product of all elements using reduce
      numbers.reduce((a, b) => a * b)
      // Equivalent to:
      // numbers.reduce(_*_)
    }

    // Example list of integers
    val nums = List(1, 2, 3, 4, 5)

    // Function Call
    val product = listProduct(nums)

    // Display the result
    println("----- Exercice 4 -----")
    println("Displaying result: ")
    println(product)
  }
}

/**
* To compile:     scalac Exercice4.scala
* To run:         scala Exercice4
*/