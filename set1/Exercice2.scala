object Exercice2 {
  def main(args: Array[String]): Unit = {
    /**
     * Function to calculate the sum of squares of elements in a list.
     * @param numbers A list of integers.
     * @return The sum of squares of the original elements.
     */
    def sumSquares(numbers: List[Int]): Int = {
      // Square each element in the list using map
      val squares = numbers.map(x => x * x)
      // Sum the squared elements using reduce
      squares.reduce((a, b) => a + b)
      // Equivalent to :
      // squares.reduce(_+_)
    }

    // Example list of integers
    val nums = List(1, 2, 3, 4, 5)

    // Function Call
    val sumOfSquares = sumSquares(nums)

    // Display the result
    println("----- Exercice 2 -----")
    println("Displaying result: ")
    println(sumOfSquares)
  }
}

/**
* To compile:     scalac Exercice1.scala
* To run:         scala Exercice1
*/