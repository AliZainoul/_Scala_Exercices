object Exercice16 {
  def main(args: Array[String]): Unit = {
    /**
     * Function to remove duplicates from a list of integers.
     * @param numbers A list of integers.
     * @return A new list with duplicates removed.
     */
    def eliminateDuplicates(numbers: List[Int]): List[Int] = {
      // Use distinct to remove duplicates
      numbers.distinct
    }

    // Example list of integers with duplicates
    val nums = List(1, 2, 3, 4, 2, 5, 3, 6, 7, 1, 4)

    // Function Call
    val uniqueNumbers = eliminateDuplicates(nums)

    // Display the result
    println("----- Exercice 16 -----")
    println("Displaying result: ")
    println(uniqueNumbers)
  }
}

/**
* To compile:     scalac Exercice16.scala
* To run:         scala Exercice16
*/
