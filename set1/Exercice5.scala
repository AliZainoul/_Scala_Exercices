object Exercice5 {
  def main(args: Array[String]): Unit = {
    /**
     * Function to calculate the sum of all even elements in a list.
     * @param numbers A list of integers.
     * @return The sum of all even elements.
     */
    def sumEvens(numbers: List[Int]): Int = {
      // Filter to retain only even numbers
      val evenNumbers = numbers.filter(_ % 2 == 0)
      // Equivalent to:
      // val evenNumbers = numbers.filter(x => x % 2 == 0)
      // Compute the sum of the even numbers using reduce
      evenNumbers.reduce(_ + _)
      // Equivalent to:
      // evenNumbers.reduce((a, b) => a + b)
    }

    // Example list of integers
    val nums = List(1, 2, 3, 4, 5, 6)

    // Function Call
    val sumOfEvens = sumEvens(nums)

    // Display the result
    println("----- Exercice 5 -----")
    println("Displaying result: ")
    println(sumOfEvens)
  }
}

/**
* To compile:     scalac Exercice5.scala
* To run:         scala Exercice5
*/