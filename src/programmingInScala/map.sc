import scala.collection.mutable.Map

val romanNumber = Map(1 ->"I", 2->"II", 3->"III", 4->"IV", 5->"V")
println(romanNumber(4))

romanNumber(1)="X"
//romanNumber.drop(1)
println(romanNumber(1))