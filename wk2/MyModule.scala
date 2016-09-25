object MyModule {
  def absolute(n: Int): Int =
    if (n < 0) -n
    else n
  // define private method formatAbsolute
  private def formatAbsolute(x: Int) = {
    // create a msg value
    val msg = "The absolute value of %d is %d"
    // formast it, each arg replaces a %d in place, respectively
    msg.format(x, absolute(x))
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
  private def formatFactorial(n: Int) = {
    val msg = "The absolute value of %d is %d"
    // formast it, each arg replaces a %d in place, respectively
    msg.format(n, factorial(n))
  }
  def main(args: Array[String]): Unit = {
    println(formatAbsolute(-42))
    println(formatAbsolute(7))
  }
}