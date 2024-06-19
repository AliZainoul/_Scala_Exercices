object Exercice3 {
  def main(args: Array[String]): Unit = {
    /**
     * Function to calculate the sum of positive elements in a list.
     * @param numbers A list of integers.
     * @return The sum of positive elements.
     */
    def sumPositive(numbers: List[Int]): Int = {
      // Filter to retain only positive numbers
      val positiveNumbers = numbers.filter(_ > 0)
      // Compute the sum of the positive numbers using reduce
      positiveNumbers.reduce(_+_)
      // Equivalent to:
      // positiveNumbers.reduce((a, b) => a + b)

    }

    // Example list of integers
    val nums = List(-1, 2, -3, 4, 5)

    // Function Call
    val sumOfPositives = sumPositive(nums)

    // Display the result
    println("----- Exercice 3 -----")
    println("Displaying result: ")
    println(sumOfPositives)
  }
}

/**
* To compile:     scalac Exercice3.scala
* To run:         scala Exercice3
*/