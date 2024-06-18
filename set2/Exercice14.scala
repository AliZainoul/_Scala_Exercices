object Exercice14 {
  def main(args: Array[String]): Unit = {
    /**
     * Function to partition a list of integers into even and odd numbers.
     * @param numbers A list of integers.
     * @return A tuple containing two lists: one with even numbers and one with odd numbers.
     */
    def partitionnateNumbers(numbers: List[Int]): (List[Int], List[Int]) = {
      // Use partition to separate even and odd numbers
      val (evenNumbers, oddNumbers) = numbers.partition(_ % 2 == 0)
      (evenNumbers, oddNumbers)
    }

    // Example list of integers
    val nums = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    // Function Call
    val (evens, odds) = partitionnateNumbers(nums)

    // Display the result
    println("----- Exercice 14 -----")
    println("Displaying result: ")
    println("Even numbers: " + evens)
    println("Odd numbers: " + odds)
  }
}

/**
* To compile:     scalac Exercice14.scala
* To run:         scala Exercice14
*/
