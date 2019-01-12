//# Exercise 63:Temperature Conversion Table
//  # (22 Lines)
//# Write a program that displays a temperature conversion table for degrees Celsius and
//# degrees Fahrenheit. The table should include rows for all temperatures between 0
//# and 100 degrees Celsius that are multiples of 10 degrees Celsius. Include appropriate
//# headings on your columns. The formula for converting between degrees Celsius and
//# degrees Fahrenheit can be found on the internet.


object ex63  extends App {
  var temp = 0
  while (temp <=100)
    {
      val fahrenheit = temp * 9/5 + 32
      println(f"$temp%d  $fahrenheit%.2f")
      temp += 10
    }

}
