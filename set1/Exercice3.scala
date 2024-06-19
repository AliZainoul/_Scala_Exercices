object Exercice3 {
  def main(args: Array[String]): Unit = {
    /**
     * Function to calculate the total length of all strings in a list.
     * @param strings A list of strings.
     * @return The total length of all strings.
     */
    def totalLength(strings: List[String]): Int = {
      // Get the length of each string in the list using map
      val lengths = strings.map(_.length)
      // Sum the lengths using reduce
      lengths.reduce(_ + _)
      // Equivalent to :
      // lengths.reduce((a, b) => a + b)
    }

    // Example list of strings
    val strs = List("Scala", "is", "fun")

    // Function Call
    val sumLengths = totalLength(strs)

    // Display the result
    println("----- Exercice 3 -----")
    println("Displaying result: ")
    println(sumLengths)
  }
}

/**
* To compile:     scalac Exercice3.scala
* To run:         scala Exercice3
*/