object Exercice10 {
  def main(args: Array[String]): Unit = {
    /**
     * Function to count the number of odd elements in a list.
     * @param numbers A list of integers.
     * @return The count of odd elements.
     */
    def countOdds(numbers: List[Int]): Int = {
      // Filter to retain only odd numbers
      val oddNumbers = numbers.filter(x => x % 2 != 0)
      // Count the number of odd elements using reduce
      oddNumbers.map(_ => 1).reduce((a, b) => a + b)
    }

    // Example list of integers
    val nums = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    // Function Call
    val countOfOdds = countOdds(nums)

    // Display the result
    println("----- Exercice 10 -----")
    println("Displaying result: ")
    println(countOfOdds)
  }
}

/**
* To compile:     scalac Exercice10.scala
* To run:         scala Exercice10
*/
