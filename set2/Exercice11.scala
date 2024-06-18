object Exercice11 {
  def main(args: Array[String]): Unit = {
    /**
     * Function to flatten a list of lists of integers into a single list.
     * @param lists A list of lists of integers.
     * @return A single list containing all elements from the nested lists.
     */
    def flattenList(lists: List[List[Int]]): List[Int] = {
      // Use flatMap to flatten the list of lists
      lists.flatMap(list => list)
    }

    // Example list of lists
    val nestedLists = List(List(1, 2), List(3, 4, 5), List(6), List(7, 8, 9))

    // Function Call
    val flattenedList = flattenList(nestedLists)

    // Display the result
    println("----- Exercice 11 -----")
    println("Displaying result: ")
    println(flattenedList)
  }
}

/**
* To compile:     scalac Exercice11.scala
* To run:         scala Exercice11
*/
