// typical comment
/* more comments */
/** documentation comment - srs bzns */

object MyModule { // declaring singleton object
  // define public method abs with argument of 'n' as an Integer;
  // returns Int (assign value using =)
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
  // main function (scala is based off the JVM afterall
  // accept arguments as an Array of strings
  // A method with return type Unit is analogous to a
  // Java method which is declared void
  // http://www.scala-lang.org/api/current/scala/Unit.html
  def main(args: Array[String]): Unit =
    println(formatAbsolute(-42))
}
/** cool, let's run this thing!
    `scalac MyModule.scala` to compile
    `scala MyModule` to run */
