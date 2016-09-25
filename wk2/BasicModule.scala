// comment
/* js style comments */
/** documentation comment */
object BasicModule {
  // singleton object
  // declares class of itself and then instantiates the only instance
  /** sum(a,b) returns a+b */
  def sum(a: Int, b: Int): Int =
    a + b
  private def formatResult(x: Int) = {
    val str = "The sum you requested is %d"
    str.format(x)
  }

  def factorial(n :Int): Int = {
    // loops functionally = recursive calls
    // called 'go' or 'loop' by definition
    // inner function of factorial
    // n is the remaining value
    // acc is the accumulated factorial
    // to advance, call go(n-1, n*acc)
    // to exit, we return the acc if n <= 0
    def go(n: Int, acc: Int): Int =
      if (n <= 0) acc
      else go(n-1, n*acc)

    go(n, 1)
  }

  def main(args: Array[String]): Unit = // unit is a void
    println(formatResult(sum(10,2)))
}