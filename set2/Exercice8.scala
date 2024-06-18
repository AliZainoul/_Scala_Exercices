object Exercice8 {
  def main(args: Array[String]): Unit = {
    /**
     * Function to sort a list of tuples (String, Int) by the integer component.
     * @param tuples A list of tuples where each tuple contains a String and an Int.
     * @return The sorted list of tuples based on the Int component.
     */
    def sortTuples(tuples: List[(String, Int)]): List[(String, Int)] = {
      // Sort tuples based on the second element (Int) using sorted
      tuples.sorted(Ordering.by[(String, Int), Int](_._2))
    }

    // Example list of tuples
    val tuples = List(("John", 25), ("Jane", 30), ("Doe", 20), ("Alice", 35))

    // Function Call
    val sortedTuples = sortTuples(tuples)

    // Display the result
    println("----- Exercice 8 -----")
    println("Displaying result: ")
    sortedTuples.foreach(println)
  }
}

/**
* To compile:     scalac Exercice8.scala
* To run:         scala Exercice8
*/