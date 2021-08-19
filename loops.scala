object loop extends App {

  //LOOPS IN SCALA

  val y1 = 4
  var r = 1
  for(i <- 1 to y1)
    r *= i

  println("r = " + r)

  // Traversing over a string
  val str = "Hello"
  var sum = 0
  for( i <- 0 until str.length)
    sum += str(i)
  println(sum)
  // Ascii values of the characters in the string are added, 72+101+108+108+111=500

  //We can directly loop over the characters in string
  sum = 0
  for(ch <- "Hello") sum += ch
  println(sum)




}
