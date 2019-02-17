package Chapter3

import scala.io.StdIn

//A particular zoo determines the price of admission based on the age of the guest.
//Guests 2 years of age and less are admitted without charge. Children between 3 and
//12 years of age cost $14.00. Seniors aged 65 years and over cost $18.00. Admission
//for all other guests is $23.00.
//Create a program that begins by reading the ages of all of the guests in a group
//from the user, with one age entered on each line. The user will enter a blank line to
//indicate that there are no more guests in the group. Then your program should display
//the admission cost for the group with an appropriate message. The cost should be
//displayed using two decimal places.


object ex67  extends App {
  var input = readLine()
  var totalprice: Float = 0

  println("Please enter the age of each person")
  println("Enter a blank line return if done")

  while (input.length>0)
  {
    def age: Int = input.toInt
    def price : Float = getPrice(age)
    println(f"age: $age  admission $price%.2f" )
    totalprice += price

    input = readLine()
  }

  println(s"Total price is $totalprice")

  def getPrice(age:Int) = {
    age match {
      case age if 0 until 2 contains age => 0
      case age if 3 until 12 contains age => 14
      case age if 13 until 65 contains age => 23
      case _ =>18
    }
  }


}
