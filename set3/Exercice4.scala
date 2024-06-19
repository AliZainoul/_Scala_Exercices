object Exercice4 {
  def main(args: Array[String]): Unit = {
    /**
     * Function to check if a list is a singleton (contains exactly one element).
     * @param list A list of elements.
     * @return true if the list is a singleton, false otherwise.
     */
    def isSingleton[A](list: List[A]): Boolean = {
      list match {
        case List(_) => true
        case _ => false
      }
    }

    // Example lists
    val list1 = List(10)
    val list2 = List("Hello", "World")
    val list3 = List.empty[Int]

    // Function Calls
    val result1 = isSingleton(list1)
    val result2 = isSingleton(list2)
    val result3 = isSingleton(list3)

    // Display the result
    println("----- Exercice 4 -----")
    println("Displaying result: ")
    // Display the results
    println(s"List $list1 is singleton: $result1")
    println(s"List $list2 is singleton: $result2")
    println(s"List $list3 is singleton: $result3")
  }
}

/**
* To compile:     scalac Exercice4.scala
* To run:         scala Exercice4
*/