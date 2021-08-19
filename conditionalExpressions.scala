import math._

object object2 extends App {


  // IF-ELSE CONDITION IN SCALA

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


}
