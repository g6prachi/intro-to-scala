import scala.collection.mutable.ArrayBuffer

object arrayBuffer extends App {

  val ab = ArrayBuffer[Int]()
  // OR ab = new ArrayBuffer[Int]
  // Empty array buffer

  for(el <- ab) print(el + " ")

  ab += 1
  // The element 1 is added at the end of the array buffer

  for(el <- ab) print(el + " ")
  println()

  ab += (1, 4, 9)
  // Multiple elements are added at the end of the array buffer

  for(el <- ab) print(el + " ")
  println()

  ab ++= Array(10, 15, 20)
  // Any collection can be appended to the array buffer with the ++= operator

  for(el <- ab) print(el + " ")
  println()

  ab.trimEnd(5)
  // Removes the last 5 elements in the array buffer

  for(el <- ab) print(el + " ")
  println()

  // Adding & Removing elements at the end of an array buffer are amortized constant time operation.
  // Adding & Removing elements at any other location is not as efficient.

  ab.insert(1, 10)
  // Insert 10 before index 1

  for(el <- ab) print(el + " ")
  println()

  ab.insert(1, 20, 30, 40)
  // We can insert multiple elements before index 1

  for(el <- ab) print(el + " ")
  println()

  ab.remove(1)
  // Deletes element at index 1

  for(el <- ab) print(el + " ")
  println()

  ab.remove(1, 3)
  // Deletes 3 elements at index 1

  for(el <- ab) print(el + " ")
  println()

  ab.toArray
  // To convert array buffer to array

  ab.toBuffer
  // To convert array to array buffer
  
}
