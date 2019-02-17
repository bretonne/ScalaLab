package Chapter3

/*
  A Fibonacci function
  f(1) = 1
  f(2) = 2
  f(n) = f(n-1) + f(n-2)
 */

object Fibonacci extends  App {

  def fibonacci(n:Int) : Int = {
    if (n==1) 1
    else if (n==2) 1
    else fibonacci(n-1) + fibonacci(n-2)
  }

  def printResult(n:Int)  = {
    val result = fibonacci(n)
    println(f"f($n)=$result")
  }

  printResult(1)
  printResult(2)
  printResult(3)
  printResult(4)
  printResult(5)
  printResult(6)
}
