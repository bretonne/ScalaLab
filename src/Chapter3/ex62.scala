//package Chapter3
//Exercise 62: Discount Table
//# (18 Lines)
//# A particular retailer is having a 60 percent off sale on a variety of discontinued
//# products. The retailer would like to help its customers determine the reduced price
//# of the merchandise by having a printed discount table on the shelf that shows the
//# original prices and the prices after the discount has been applied. Write a program that
//# uses a loop to generate this table, showing the original price, the discount amount,
//# and the new price for purchases of $4.95, $9.95, $14.95, $19.95 and $24.95. Ensure
//# that the discount amounts and the new prices are rounded to 2 decimal places when
//# they are displayed.

object ex62 extends App {
  val prices = List(4.95, 9.95, 14.95, 19.95, 24.95)
  //val discounts = prices.map(p => p*0.6)
  //val discounted = prices.map(p=> p*0.4)

  println("price\tdiscounts\t price after discounts")

  for (elem <- prices) {
    println(f"$elem%.2f, ${elem*0.6}%.2f, ${elem*0.4}%.2f")
  }
}
