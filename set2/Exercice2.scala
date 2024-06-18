object Exercice2 {
  def main(args: Array[String]): Unit = {
    /**
     * Function to return a list of cumulative sums of elements in the list.
     * @param numbers A list of integers.
     * @return A list of cumulative sums.
     */
    def cumulativeSum(numbers: List[Int]): List[Int] = {
      // Calculate the cumulative sums using scanLeft
      numbers.scanLeft(0)(_ + _).tail
    }

    // Example list of integers
    val nums = List(1, 2, 3, 4, 5)

    // Function Call
    val cumulSum = cumulativeSum(nums)

    // Display the result
    println("----- Exercice 2 -----")
    println("Displaying result: ")
    println(cumulSum)
  }
}

/**
* To compile:     scalac Exercice2.scala
* To run:         scala Exercice2
*/