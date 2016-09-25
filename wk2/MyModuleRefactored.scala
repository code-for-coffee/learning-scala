object MyModuleRefactored {
  def absolute(n: Int): Int =
    if (n < 0) -n
    else n
  // define private method formatAbsolute
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
  // this is a HOF (higher order function)
  def formatResult(name: String, n: Int, f: Int => Int) = {
    // define f as a function accepts argument int, returns int
    // verbage: f equals Int to Int
    val msg = "The %s of %d is %d."
    msg.format(name, n, f(n))
  }

  def main(args: Array[String]): Unit = {
    println(formatResult("abs value", -42, absolute))
    println(formatResult("factorial", 7, factorial))
  }
}