import math._

object object1 extends App {

  println("Hello World")

  //This is used to find out the common letters in both Strings
  val overlap: String = "Hello".intersect("World")
  println(overlap)

  //Coverts the integer 1 to a String "1"
  val one: Any = 1.toString()
  println(one)

  //Yields a range from 1 to n (n=7, here)
  println(1.to(7))

  //Arithmetic operators do their usual job
  val ans = 4 * 5 + 7
  println(ans)

  //The arithmetic operators are actually methods
  println(4.+(7))

  var uniq: Any = "Mississippi".distinct
  println(uniq)

  //This is similar to str.charAt(3) in Java
  println("Hello"(3))

  // This can be used to create an array
  println(Array(1, 4, 9, 16))

  //We have imported the math package to use these functions
  println(pow(2,5))
  println(min(5, Pi))

  //Multiplying a string by an integer concatenates the string the given number of times to itself
  val str_multiply: String = "Scala"*4
  println(str_multiply)

}
