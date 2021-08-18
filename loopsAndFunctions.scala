import math._

object object2 extends App {

  var x = 0
  val y = if (x > 0) 10 else -10
  println(y)

  x += 1
  // y = if (x > 0) 10 else -10   >>> This statement shows error, as y has been declared as a val, hence, can't change value
  var z = if (x > 0) 10 else -10
  println(z)

  // z = if (x > 0) "Positive" else -10    >>> This statement shows error because z has been given the type Int according to the last statement
  var w = if (x > 0) "Positive" else -10
  println(w)
  //Here, w would get a type of Any, which is the supertype of both the branches, i.e., java.lang.String and Int

  w = if (x > 0) 10 else ()
  println(w)

  x = -2
  w = if (x > 0) 10 else ()
  println(w)

  //Semi-colons are used to have more than one statements in a single line, to separate them
  var r = -10
  if(x < 0) { r = r * x; x += 1}
  println("r = " + r)
  println("x = " + x)

  //The following syntax is preferred over the last one
  if(x < 0) {
    r = r * x
    x += 1
  }
  println("r = " + r)
  println("x = " + x)


  val x0 = 0
  val y0 = 0
  var x1 = 3
  var y1 = 4
  val dist = { val dx = x1 - x0; val dy = y1 - y0; sqrt( dx * dx + dy * dy ) }
  //The value of the block is the last expression
  println("distance calculated = " + dist)
  // println(dx)   >>> This statement shows error as dx is declared inside a block

  r = 1
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
