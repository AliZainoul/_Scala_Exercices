object Exercice9 {
  def main(args: Array[String]): Unit = {
    /**
     * Function to describe the first three elements of a list using pattern matching.
     * @param list A list of integers.
     * @return A string describing the first three elements or indicating fewer elements.
     */
    def decomposeList(list: List[Int]): String = {
      list match {
        case Nil => "Empty list"
        case List(a) => s"List with one element: $a"
        case List(a, b) => s"List with two elements: $a, $b"
        case List(a, b, c) => s"List with three elements: $a, $b, $c"
        case _ => "List with more than three elements"
      }
    }

    // Example lists
    val list1 = List(1, 2, 3)
    val list2 = List(10, 20)
    val list3 = List(5)
    val list4 = List.empty[Int]

    // Function Calls
    val result1 = decomposeList(list1)
    val result2 = decomposeList(list2)
    val result3 = decomposeList(list3)
    val result4 = decomposeList(list4)

    // Display the result
    println("----- Exercice 9 -----")
    println("Displaying result: ")
    // Display the results
    println(s"List $list1: $result1")
    println(s"List $list2: $result2")
    println(s"List $list3: $result3")
    println(s"List $list4: $result4")
  }
}

/**
* To compile:     scalac Exercice9.scala
* To run:         scala Exercice9
*/