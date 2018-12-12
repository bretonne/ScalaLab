//package Chapter2
//# Exercise 34: Even or Odd?
//# (Solved—13 Lines)
//# Write a program that reads an integer from the user. Then your program should
//# display a message indicating whether the integer is even or odd.

object ex34 extends App {
  val input = args(0).toInt
  if (input%2==0)
    println(input + " is an event number")
  else
    println(input + " is an odd number")
}
