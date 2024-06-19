object Exercice2 {
  def main(args: Array[String]): Unit = {
    /**
     * Function to decompose a tuple (Int, String, Boolean) and return a string describing its elements.
     * @param tuple A tuple of type (Int, String, Boolean).
     * @return A string describing the elements of the tuple.
     */
    def decompose(tuple: (Int, String, Boolean)): String = {
      tuple match {
        case (num, str, bool) => s"Tuple elements are: $num, $str, $bool"
      }
    }

    // Example tuple
    val tuple1 = (10, "Hello", true)

    // Function Call
    val result = decompose(tuple1)

    // Display the result
    println("----- Exercice 2 -----")
    println("Displaying result: ")
    println(result)
  }
}

/**
* To compile:     scalac Exercice2.scala
* To run:         scala Exercice2
*/