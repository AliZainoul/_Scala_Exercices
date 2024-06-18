object Exercice5 {
  def main(args: Array[String]): Unit = {
    /**
     * Function to calculate the sum of even elements in a list.
     * @param numbers A list of integers.
     * @return The sum of even elements.
     */
    def sumEven(numbers: List[Int]): Int = {
      // Filter to retain only even numbers
      val evenNumbers = numbers.filter(_ % 2 == 0)
      // Compute the sum of the even numbers using reduce
      evenNumbers.reduce((a, b) => a + b)
    }

    // Example list of integers
    val nums = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    // Function Call
    val sumOfEvens = sumEven(nums)

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