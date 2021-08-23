import scala.collection.mutable.ArrayBuffer

object arrays extends App {

  val arr1 = new Array[Int](10)
  // Array of ten integers initialized with 0

  val arr2 = new Array[String](10)
  // String array of ten elements initialized with null

  val arr3 = Array("Hello", "World")
  // String array of length 2 - the type is inferred from the provided values

  arr3(0) = "Hi"
  // Using parenthesis () to access the array elements

  for(el <- arr3) print(el + " ")
  // Hence, we can see that array element has been changed
  println()

}
