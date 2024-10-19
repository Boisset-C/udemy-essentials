package lectures.part1basics

object Functions extends App {

  def aFunction(parameter: String, numberParameter: Int): String = {
    parameter + " " + numberParameter
  }

  println(aFunction("hello", 3))
    
  def aParameterlessFunction(): Int = 42
  
  println(aParameterlessFunction())
  
  // a recursion functions needs to know the result type.
  def aRepeatedFunction(aString: String, n: Int): String =
    if (n == 1) aString
    else  aString + aRepeatedFunction(aString, n - 1)
  
  println(aRepeatedFunction("hello", 3))
  
  //In scala or functional language use recursive functions instead of Loops
  def aFunctionWithSideEffects(aString: String): Unit = println(aString)
  
  def aBigFunction(n: Int): Int =
    def aSmallerFunction(a: Int, b: Int): Int = a + b
    
    aSmallerFunction(n, n-1)

  //1. A greeting function(name, age) => "Hi, my name is $name and I am $age years old"
  def aGreeting(name: String, age: Int): String =
    "Hi, my name is " + name + " and I am " + age + " years old"


  println(aGreeting("Cosme", 15))

  //2. Factorial function 1 * 2 * 3 * n (recursive function)
  def aFactorial(n: Int):Int =
    if (n <= 0) 1
    else n * aFactorial(n - 1)

  println(aFactorial(5))

  //3. Fibonacci function f(1), f(1)...f(n - 1) + f(n-2)
  def fibonacci(n: Int): Int =
    if (n <= 2) 1
    else fibonacci(n - 1) + fibonacci(n - 2)

  println(fibonacci(8))

  //4. 4. Function isPrime()
  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if(t <= 1) true
      else n % t != 0 && isPrimeUntil(t-1)

    isPrimeUntil(n / 2)  
  }
  println(isPrime(37))
  println(isPrime(2003))
  println(isPrime(37 * 17))


}






