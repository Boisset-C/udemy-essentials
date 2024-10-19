package lectures.part1basics

object ValuesVariablesTypes extends  App {

  //VALs ARE IMMUTABLE, Types of val are optional
  //Compiler can infer types
  val x: Int = 42

  println(x)

  val aString: String = "Hello"
  val anotherString = "Goodbye"

  println(aString)
  println(anotherString)

  //Types
  val aBoolean: Boolean = false
  //Single quotes for a char
  val aChar: Char = 'f'
  //you can use reference types
  val aValue: Int = x
  val aShort: Short = 4613
  val aLong: Long = 405049212
  val aFloat: Float = 4.5605f
  val aDouble: Double = 4.52023213

  //variables in scala defined by var. Variables are mutable
  var aVariable: Int = 4 //sideEffect - allows you to see what program is doing


}
