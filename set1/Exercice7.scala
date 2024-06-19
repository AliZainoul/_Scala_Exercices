object Exercice7 {
  def main(args: Array[String]): Unit = {
    /**
     * Function to concatenate all strings in a list.
     * @param strings A list of strings.
     * @return A single string containing all concatenated strings.
     */
    def concatenateStrings(strings: List[String]): String = {
      // Concatenate all strings in the list using reduce
      strings.reduce(_ + _)
      // Equivalent to:
      // strings.reduce((a, b) => a + b)
    }

    // Example list of strings
    val strs = List("Scala", "is", "awesome")

    // Function Call
    val concatenatedString = concatenateStrings(strs)

    // Display the result
    println("----- Exercice 7 -----")
    println("Displaying result: ")
    println(concatenatedString)
  }
}

/**
* To compile:     scalac Exercice7.scala
* To run:         scala Exercice7
*/