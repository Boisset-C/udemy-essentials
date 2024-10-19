package lectures.part1basics

object Expressions extends App {

  val x: Int = 1 + 2
  println(x)

  println(3 + 4 * 3)
  // + - / * & | ^ << >> >>> (right shift with zero extension)

  println(1 == x)
  // == != > >= < <=

  println(!(1 == x))
  // ! && ||

  var aVariable2 = 2
  aVariable2 += 3 // also works with -= *= /= etc... side effects
  println(aVariable2)

  //Instructions (DO) vs Expressions (VALUE)
  //Instructions something that you tell the computer to do
  //Expressions something that has a value (functional programming way of thinking

  //IF expression
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3
  println(aConditionedValue)
  println(if(aCondition) 5 else 3)
  println(1 + 3)

  //While loops (loops are discouraged in scala)
  var i = 0
  while ( i < 10) {
    println(i)
    i += 1
  }

  //EVERYTHING IN SCALA IS AN EXPRESSION!
  //In Scala side effects are expressions returning Units
  val aWeirdValue = (aVariable2 = 3) // unit === void
  println(aWeirdValue) // unit will only be equal to ()
  //side effects example println(), whiles, reassigning and expressions return units

  //code blocks - special kind of expressions with special properties
  //value of code block is val of last expression contained
  val aCodeBlock = {
    val y = 2
    val z = 1 + y

    if (y > 2)  "Hello!" else "Good Bye!"
  }

println(aCodeBlock)

//Exercises
//1. What is difference between the string "Hello World" vs println("Hello world")
//(MyAnswer) string is an expression (it evaluates to this value). The value of println is a side effect.
//2. What is the value of
  val someValue = {
    2 < 3
  }
//(MyAnswer) True
val someOtherValue = {
  if (someValue) 239 else 405
  42
}
//(MyAnswer) 42 the last value of the code block is how it evaluates

}
