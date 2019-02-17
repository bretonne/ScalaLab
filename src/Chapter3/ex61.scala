//package Chapter3
//# Exercise 61:Average
//  # (26 Lines)
//# In this exercise you will create a program that computes the average of a collection
//# of values entered by the user. The user will enter 0 as a sentinel value to indicate
//# that no further values will be provided. Your program should display an appropriate
//# error message if the first value entered by the user is 0.
//# Hint: Because the 0 marks the end of the input it should not be included in the
//# average.

object ex61 extends App {
  val inputs = args
  if (inputs.head==0)
    println("Input numbers cannot start with 0")
  else {
    var sum = 0
    inputs.foreach{sum += _.toInt}
    println(s"Sum is ${sum} and average is ${sum/inputs.length}")
  }
}
