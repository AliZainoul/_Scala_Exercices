object Exercice13 {
  def main(args: Array[String]): Unit = {
    /**
     * Function to concatenate each string with its index in a list.
     * @param strings A list of strings.
     * @return A list of strings where each string is concatenated with its index.
     */
    def concatenateWithIndices(strings: List[String]): List[String] = {
      // Use zipWithIndex to pair each string with its index
      val indexedStrings = strings.zipWithIndex
      // Use map to concatenate each string with its index
      indexedStrings.map { case (str, index) => s"$index: $str" }
    }

    // Example list of strings
    val strings = List("apple", "banana", "cherry", "date")

    // Function Call
    val concatenatedList = concatenateWithIndices(strings)

    // Display the result
    println("----- Exercice 13 -----")
    println("Displaying result: ")
    concatenatedList.foreach(println)
  }
}

/**
* To compile:     scalac Exercice13.scala
* To run:         scala Exercice13
*/
