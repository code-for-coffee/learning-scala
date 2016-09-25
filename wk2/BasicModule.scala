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

  def main(args: Array[String]): Unit =
    println(formatResult(sum(10,2)))
}