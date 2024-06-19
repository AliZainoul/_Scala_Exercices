object Exercice6 {
  def main(args: Array[String]): Unit = {
    /**
     * Function to double each element in a list.
     * @param numbers A list of integers.
     * @return A list where each element is doubled.
     */
    def doubleElements(numbers: List[Int]): List[Int] = {
      // Double each element in the list using map
      numbers.map(_ * 2)
      // Equivalent to:
      // numbers.map(x => x * 2)
    }

    // Example list of integers
    val nums = List(1, 2, 3, 4, 5)

    // Function Call
    val doubledNums = doubleElements(nums)

    // Display the result
    println("----- Exercice 6 -----")
    println("Displaying result: ")
    println(doubledNums)
  }
}

/**
* To compile:     scalac Exercice6.scala
* To run:         scala Exercice6
*/