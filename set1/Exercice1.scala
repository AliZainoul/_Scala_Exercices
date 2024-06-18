object Exercice1 {
  def main(args: Array[String]): Unit = {
    /**
     * Function to square each element in a list.
     * @param numbers A list of integers.
     * @return A list where each element is the square of the original element.
     */
    def squares(numbers: List[Int]): List[Int] = {
      numbers.map(x => x * x)
    }

    // Example list of integers
    val nums = List(1, 2, 3, 4, 5)

    // Function Call
    val squaredNums = squares(nums)

    // Display the result
    println("Displaying result: ")
    println(squaredNums)
  }
}

/**
* To compile:     scalac Exercice1.scala
* To run:         scala Exercice1
*/