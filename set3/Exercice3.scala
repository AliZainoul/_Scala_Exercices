object Exercice3 {
  def main(args: Array[String]): Unit = {
    /**
     * Function to return the day of the week based on an integer input.
     * @param dayNumber An integer from 1 to 7 representing the day of the week.
     * @return A string representing the corresponding day of the week.
     */
    def dayOfTheWeek(dayNumber: Int): String = {
      dayNumber match {
        case 1 => "monday"
        case 2 => "tuesday"
        case 3 => "wednesday"
        case 4 => "thursday"
        case 5 => "friday"
        case 6 => "saturday"
        case 7 => "sunday"
        case _ => "invalid day number"
      }
    }

    // Example day numbers
    val day1 = 1
    val day2 = 3
    val day3 = 7
    val day4 = 9

    // Function Calls
    val result1 = dayOfTheWeek(day1)
    val result2 = dayOfTheWeek(day2)
    val result3 = dayOfTheWeek(day3)
    val result4 = dayOfTheWeek(day4)

    // Display the result
    println("----- Exercice 3 -----")
    println("Displaying result: ")
    // Display the results
    println(s"Day $day1 is: $result1")
    println(s"Day $day2 is: $result2")
    println(s"Day $day3 is: $result3")
    println(s"Day $day4 is: $result4")
  }
}

/**
* To compile:     scalac Exercice3.scala
* To run:         scala Exercice3
*/