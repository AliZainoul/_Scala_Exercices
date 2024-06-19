object Exercice5 {
  def main(args: Array[String]): Unit = {
    /**
     * Function to describe the type of a variable using pattern matching.
     * @param variable Any variable whose type needs to be described.
     * @return A string describing the type of the variable.
     */
    def typeOfVariable(variable: Any): String = {
      variable match {
        case _: Int => "Integer"
        case _: Double => "Double"
        case _: String => "String"
        case _: Boolean => "Boolean"
        case _: Char => "Char"
        case _: List[_] => "List"
        case _ => "Unknown Type"
      }
    }

    // Example variables of different types
    val var1: Int = 10
    val var2: String = "Hello"
    val var3: Double = 3.14
    val var4: Boolean = true
    val var5: Char = 'a'
    val var6: List[Int] = List(1, 2, 3)
    val var7 = (1, "Scala", true) // tuple

    // Function Calls
    val result1 = typeOfVariable(var1)
    val result2 = typeOfVariable(var2)
    val result3 = typeOfVariable(var3)
    val result4 = typeOfVariable(var4)
    val result5 = typeOfVariable(var5)
    val result6 = typeOfVariable(var6)
    val result7 = typeOfVariable(var7)

    // Display the result
    println("----- Exercice 5 -----")
    println("Displaying result: ")
    // Display the results
    println(s"Type of $var1 is: $result1")
    println(s"Type of $var2 is: $result2")
    println(s"Type of $var3 is: $result3")
    println(s"Type of $var4 is: $result4")
    println(s"Type of $var5 is: $result5")
    println(s"Type of $var6 is: $result6")
    println(s"Type of $var7 is: $result7")
  }
}

/**
* To compile:     scalac Exercice5.scala
* To run:         scala Exercice5
*/