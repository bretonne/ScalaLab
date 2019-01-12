package Chapter3

/*
     Factorial function 1*2*3*4*...*n
 */

object Factorial extends App {

  def factorial(n:Int) : Int = {
    if (n==1) {
      print(f"$n ")
      1
    }
    else {
      print(f"$n*")
      n * factorial(n - 1)
    }
  }

  def printResult(n:Int): Unit =
  {
    val result = factorial(n)
    println(f"= $result" )
  }

  printResult(1)
  printResult(2)
  printResult(4)
  printResult(16)
}
