package Chapter4

//Exercise 92: Is a Number Prime?
//(Solved—28 Lines)
//A prime number is an integer greater than 1 that is only divisible by one and itself.
//Write a function that determines whether or not its parameter is prime, returning
//True if it is, and False otherwise. Write a main program that reads an integer
//from the user and displays a message indicating whether or not it is prime. Ensure
//that the main program will not run if the file containing your solution is imported
//into another program.

object ex92 extends App {

  def findNumberOfFactors(n:Int) : Int =
  {
    val numbers = 1 to n toList

    var factors = numbers.filter(p => n%p==0)

    factors.length
  }


  def isPrime(n:Int) : Boolean = {
    findNumberOfFactors(n)<=2  //more than 1 and self
  }

  def printResult(n:Int) = {
    if (isPrime(n))
      println(n + " is a prime number")
    else
      println(n + " is not a prime number")
  }

  printResult(3)
  printResult(3)
  printResult(6)
  printResult(31)
  printResult(32)



}
