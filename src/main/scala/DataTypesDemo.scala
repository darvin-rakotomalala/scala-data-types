class DataTypesDemo {

  def exampleDataTypes(): Unit = {
    // Primitive types
    val age: Int = 10
    val salary: Double = 1234.5
    val isActive: Boolean = false

    // Reference types
    val name: String = "Darvin"
    val scores: Array[Int] = Array(10, 20, 30)
    val person: (String, Int) = ("Darvin", 32) // Tuple
    val status: Option[String] = Some("Active")

    // Output the values
    println(s"- Name: $name, Age: $age, Salary: $salary, Active: $isActive")
    println(s"- Scores: ${scores.mkString(", ")}")
    println(s"- Person: Name = ${person._1}, Age = ${person._2}")
    println(s"- Status: ${status.getOrElse("Unknown")}")
  }

  /*
   * Type casting is the process of converting that type from one to another. For example,
   * we can convert int type to float type in Scala.
   */
  def implicitTypeCasting(): Unit = {
    val a: Int = 3421
    println("- a has value: " + a + " and its type is: " + a.getClass)
    val c = a / 4 // result is 855.25 but will be converted to Int
    println("- The value of a/4: " + c + " and its type is: " + c.getClass)
  }

  def explicitTypeCasting(): Unit = {
    // Type conversion from Short to Long
    val a: Short = 3421
    println("- a has value: " + a + " and its type is: " + a.getClass)
    val b: Long = a // converting type from short to long
    println("- Type casting from Short to Long")
    println("- b has value: " + b + " and its type is: " + b.getClass)

    // Type conversion from Char to Float
    val ch: Char = 'S'
    println("\nch has value: " + ch + " and its type is: " + ch.getClass)
    val fl: Float = ch // converting type from Char to Float
    println("- Type casting from Character to Float: ")
    println("- fl has value: " + fl + " and its type is: " + fl.getClass)
  }

}
