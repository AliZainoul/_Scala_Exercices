object Exercice15 {
  def main(args: Array[String]): Unit = {
    /**
     * Function to group strings by their first letter.
     * @param strings A list of strings.
     * @return A map where keys are the first letters of strings and values are lists of strings with the same first letter.
     */
    def groupByFirstLetter(strings: List[String]): Map[Char, List[String]] = {
      // Use groupBy to group strings by their first letter
      strings.groupBy(_.head)
    }

    // Example list of strings
    val strings = List("apple", "banana", "avocado", "orange", "pear")

    // Function Call
    val groupedByFirstLetter = groupByFirstLetter(strings)

    // Display the result
    println("----- Exercice 15 -----")
    println("Displaying result: ")
    groupedByFirstLetter.foreach { case (letter, words) =>
      println(s"$letter: $words")
    }
  }
}

/**
* To compile:     scalac Exercice15.scala
* To run:         scala Exercice15
*/
