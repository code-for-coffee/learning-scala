object HelloWorld { // declaring singleton object
  // main function (scala is based off the JVM afterall
  // accept arguments as an Array of strings
  // A method with return type Unit is analogous to a
  // Java method which is declared void
  // http://www.scala-lang.org/api/current/scala/Unit.html
  val x = "Hello, World"

  def main(args: Array[String]) :Unit =
    println(x)
}
