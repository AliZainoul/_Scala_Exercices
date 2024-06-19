object Exercice7 {
  def main(args: Array[String]): Unit = {
    /**
     * Function to describe the size of a list using pattern matching.
     * @param list A list of elements.
     * @return A string describing the size of the list ("vide", "singleton", "plusieurs éléments").
     */
    def tailleListe[A](list: List[A]): String = {
      list match {
        case Nil => "empty"
        case _ :: Nil => "singleton"
        case _ => "many elements"
      }
    }

    // Example lists
    val list1 = List(10)
    val list2 = List("Hello", "World")
    val list3 = List.empty[Int]

    // Function Calls
    val result1 = tailleListe(list1)
    val result2 = tailleListe(list2)
    val result3 = tailleListe(list3)

    // Display the result
    println("----- Exercice 7 -----")
    println("Displaying result: ")
    // Display the results
    println(s"List $list1: $result1")
    println(s"List $list2: $result2")
    println(s"List $list3: $result3")
  }
}

/**
* To compile:     scalac Exercice7.scala
* To run:         scala Exercice7
*/