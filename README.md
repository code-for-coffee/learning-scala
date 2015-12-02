# learning-scala
Repository for code I write while learning Scala.


## Compiling Scala

* `brew install scala` on OS X
* `scalac MyFile.scala` to compile a Scala file.
* `scala MyFile` to run your Scala application.


## Basic Object

```scala
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

```

