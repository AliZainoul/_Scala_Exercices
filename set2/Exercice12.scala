object Exercice12 {
  def main(args: Array[String]): Unit = {
    /**
     * Function to calculate the product of non-zero elements in a list.
     * @param numbers A list of integers.
     * @return The product of non-zero elements.
     */
    def productOfNonZeros(numbers: List[Int]): Int = {
      // Filter to retain only non-zero numbers
      val nonZeroNumbers = numbers.filter(_ != 0)
      // Compute the product of the non-zero numbers using foldLeft
      nonZeroNumbers.foldLeft(1)(_ * _)
    }

    // Example list of integers
    val nums = List(1, 2, 0, 3, 0, 4, 5)

    // Function Call
    val productNonZeros = productOfNonZeros(nums)

    // Display the result
    println("----- Exercice 12 -----")
    println("Displaying result: ")
    println(productNonZeros)
  }
}

/**
* To compile:     scalac Exercice12.scala
* To run:         scala Exercice12
*/
