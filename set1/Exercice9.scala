object Exercice9 {
  def main(args: Array[String]): Unit = {
    /**
     * Function to find the maximum length of strings in a list.
     * @param strings A list of strings.
     * @return The maximum length of the strings.
     */
    def maxLength(strings: List[String]): Int = {
      // Get the length of each string in the list using map
      val lengths = strings.map(_.length)
      // Find the maximum length using reduce
      lengths.reduce((a, b) => if (a > b) a else b)
    }

    // Example list of strings
    val strs = List("Scala", "is", "awesome", "and", "powerful")

    // Function Call
    val maximumLength = maxLength(strs)

    // Display the result
    println("Displaying result: ")
    println(maximumLength)
  }
}

/**
* To compile:     scalac Exercice9.scala
* To run:         scala Exercice9
*/
