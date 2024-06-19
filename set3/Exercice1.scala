object Exercice1 {
  def main(args: Array[String]): Unit = {
    /**
     * Function to determine the sign of an integer using pattern matching.
     * @param number An integer.
     * @return A string: "positif" if number > 0, "négatif" if number < 0, "zéro" if number == 0.
     */
    def sign(number: Int): String = {
      number match {
        case x if x > 0 => "positive"
        case x if x < 0 => "negative"
        case _ => "zéro"
      }
    }

    // Example integers
    val int1 = 10
    val int2 = -5
    val int3 = 0

    // Function Calls
    val result1 = sign(int1)
    val result2 = sign(int2)
    val result3 = sign(int3)

    // Display the result
    println("----- Exercice 1 -----")
    println("Displaying result: ")
    // Display the results
    println(s"Sign of $int1 is: $result1")
    println(s"Sign of $int2 is: $result2")
    println(s"Sign of $int3 is: $result3")
  }
}

/**
* To compile:     scalac Exercice1.scala
* To run:         scala Exercice1
*/
