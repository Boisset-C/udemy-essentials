package lectures.part1basics

import scala.annotation.tailrec
import scala.jdk.Accumulator

object Recursion extends App {

  def factorial(n: Int): Int =
    if(n <= 1) 1
    else n * factorial(n-1)


  println(factorial(10000))

  def anotherFactorial(n: BigInt): BigInt = {
    @tailrec
    def factHelper(x: BigInt, accumulator: BigInt): BigInt =
      if (x <= 1) accumulator
      else factHelper(x - 1, x * accumulator) //TAIL recursion = use recursive call as the last expression

    factHelper(n, 1)
  }
/*
= facthelper(3, 4 * 1)
= facthelper(2, 4 * 1, * 3)
//24
*/
 println(anotherFactorial(4))
 println(anotherFactorial(5000))

//WHEN YOU NEED LOOPS, USE _TAIL_ Recursion

//1. Concatonate a string using tail recursion
  def aStringBuilder(string: String, n: Int):String = {
    @tailrec
    def aStringHelper(stringParameter: String, x: Int, accumulator: String): String =
      if(x <= 0) accumulator
      else aStringHelper(stringParameter, x - 1, accumulator + stringParameter)

    aStringHelper(string,n, "")
  }
println(aStringBuilder("Hello", 3))


//2. isPrime function tail recursive
 def isPrime(n: BigInt): Boolean = {
   @tailrec
   def isPrimeHelper(x: BigInt, isStillPrime: Boolean): Boolean =
     if (!isStillPrime) false
     else if (x <= 1) true
     else isPrimeHelper(x - 1, n % x != 0 && isStillPrime)

   isPrimeHelper(n / 2, true)
 }

println(isPrime(2003))
println(isPrime(629))

//3. Fibonaci function tail recursive
 def fibonacci(n: Int): Int = {
   @tailrec
   def fibHelper(x: Int, last: Int, nextToLast: Int):Int =
     if (x >= n) last
     else fibHelper(x + 1, last + nextToLast, last)

   if (n <= 2) 1
   else fibHelper(2, 1, 1)

 }

println(fibonacci(8))
}

