import scala.math.sqrt

object blockExpressions extends App {

  // BLOCK EXPRESSIONS AND ASSIGNMENTS IN SCALA

  val x0 = 0
  val y0 = 0
  var x1 = 3
  var y1 = 4
  val dist = { val dx = x1 - x0; val dy = y1 - y0; sqrt( dx * dx + dy * dy ) }
  //The value of the block is the last expression
  println("distance calculated = " + dist)
  // println(dx)   >>> This statement shows error as dx is declared inside a block


}
