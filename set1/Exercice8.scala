object Exercice8 {
  def main(args: Array[String]): Unit = {
    /**
     * Function to calculate the average of elements in a list.
     * @param numbers A list of integers.
     * @return The average of the elements.
     */
    def averageList(numbers: List[Int]): Double = {
      // Calculate the sum of all elements using reduce
      val sum = numbers.reduce(_ + _)
      // Equivalent to:
      // val sum = numbers.reduce((a, b) => a + b)
    
      // Calculate the average using map and reduce
      sum.toDouble / numbers.length
    }

    // Example list of integers
    val nums = List(1, 2, 3, 4, 5)

    // Function Call
    val average = averageList(nums)

    // Display the result
    println("----- Exercice 8 -----")
    println("Displaying result: ")
    println(average)
  }
}

/**
* To compile:     scalac Exercice8.scala
* To run:         scala Exercice8
*/
