object functionsInScala extends  App {

  def abs(x: Double) = if (x >= 0) x else -x

  //Blocks in functions
  def fac(n : Int) = {
    var r = 1
    for(i <- 1 to n) r = r * i
    r
  }

  // Recursive Function should have a return value
  def fact(n: Int): Int = if(n <= 0) 1 else n * fac(n - 1)


  // Default Arguments
  def enclose(str: String, left: String = "[", right: String = "]") = left + str + right

  // Variable Number of Arguments
  def sum(args: Int*) = {
    var result = 0
    for(arg <- args) result += arg
    result
  }

  val s = sum(1 to 5: _*)
  println(s)

  def sum1(args: Int*) : Int = {
    if(args.length == 0) 0
    else args.head + sum1(args.tail : _*)
  }

  val s1 = sum1(1 to 5: _*)
  println(s1)

  //Procedure
  def printfunc(s: String): Unit = {
    println(s)
  }
  //A procedure returns no value, hence, return type Unit

  printfunc("Hello")

  



}
