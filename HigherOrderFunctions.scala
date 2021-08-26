object HigherOrderFunctions extends App {


  // A higher-order function has at least one of the following properties:
  // 1) Takes one or more functions as parameters
  // 2) Returns a function as a result


  def add(x: Int, y: Int): Int = x + y
  def subtract(x: Int, y: Int): Int = x - y
  def multiply(x: Int, y: Int): Int = x * y

  def performArithmeticOperation(num1: Int, num2: Int, operation: String): Int = {
    operation match {
      case "add" => add(num1, num2)
      case "subtract" => subtract(num1, num2)
      case "multiply" => multiply(num1, num2)
      case _ => -1
    }
  }

  val sum = performArithmeticOperation(10, 3, "add")
  val difference = performArithmeticOperation(10, 3, "subtract")
  val product = performArithmeticOperation(10, 3, "multiply")

  println("Sum = " + sum)
  println("Difference = " + difference)
  println("Product = " + product)

  println("----------------------------------")

  def addArray(arr: Array[Int]): Int = arr.sum
  def multiplyArray(arr: Array[Int]): Int = {
    var prod = 1
    for(elem <- arr) prod *= elem
    prod
  }

  def performArrayOperation(arr: Array[Int], operation: String): Int = {
    operation match {
      case "add" => addArray(arr)
      case "multiply" => multiplyArray(arr)
      case _ => -1
    }
  }

  var arr = Array(2, 3, 6, 10)

  val sumArr = performArrayOperation(arr, "add")
  val productArr = performArrayOperation(arr, "multiply")

  println("Sum of Array Elements = " + sumArr)
  println("Product of Array Elements = " + productArr)


}
