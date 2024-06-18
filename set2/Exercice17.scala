object Exercice17 {
  def main(args: Array[String]): Unit = {
    /**
     * Function to find the first string containing the character 'a' in a list.
     * @param strings A list of strings.
     * @return An Option containing the first string with the character 'a', or None if no such string is found.
     */
    def findWithA(strings: List[String]): Option[String] = {
      // Use find to get the first string that contains 'a'
      strings.find(str => str.contains('a'))
    }

    // Example list of strings
    val strings = List("banana", "apple", "cherry", "date", "fig")

    // Function Call
    val result = findWithA(strings)

    // Display the result
    println("----- Exercice 17 -----")
    println("Displaying result: ")
    result match {
      case Some(str) => println(s"Found: $str")
      case None => println("No string containing 'a' found")
    }
  }
}

/**
* To compile:     scalac Exercice17.scala
* To run:         scala Exercice17
*/
