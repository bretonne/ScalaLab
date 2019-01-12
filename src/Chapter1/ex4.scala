//package Chapter1

//package Chapter1
//# Exercise 3:Area of a Room
//# (Solved—13 Lines)
//# Write a program that asks the user to enter the width and length of a room. Once
//# the values have been read, your program should compute and display the area of the
//# room. The length and the width will be entered as floating point numbers. Include
//# units in your prompt and output message; either feet or meters, depending on which
//# unit you are more comfortable working with.

object ex4  extends App{
  val SQUARE_FEET_PER_ACRE = 43560

  val len = args(0).toFloat
  val width = args(1).toFloat

  val area :Float = len * width/43560

  println(f"Area of $len%.1f foot and $width%.1f foot is $area%.2f acre")
}
