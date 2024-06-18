object Exercice1 {
  def main(args: Array[String]): Unit = {
    import scala.collection.mutable.ListBuffer

    /**
     * Function to return all possible combinations of n elements from a list.
     * @param numbers A list of integers.
     * @param n The number of elements in each combination.
     * @return A list of lists, each containing a combination of n elements.
     */
    def combinationsN(numbers: List[Int], n: Int): List[List[Int]] = {
      // Generate all combinations of n elements
      numbers.combinations(n).toList
    }

    // Example list of integers and combination size
    val nums = List(1, 2, 3, 4, 5)
    val n = 3

    // Function Call
    val combinations = combinationsN(nums, n)

    // Display the result
    println("----- Exercice 1 -----")
    println("Displaying result: ")
    combinations.foreach(println)
  }
}

/**
* To compile:     scalac Exercice1.scala
* To run:         scala Exercice1
*/