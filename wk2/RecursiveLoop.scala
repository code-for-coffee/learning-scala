object RecursiveLoop {

  def fib(n: Int): Int = {
    def loop(n: Int, a: Int, b: Int): Int =
      if (n <= 0) a+b
      else loop(n-1, b, a+b)
    loop(n, 0, 1)
  }

  def main(args: Array[String]): Unit =
    //val n = 9
    println("RecursiveLoop")
    println("Solving for 6th in Fib Sequence...")
    //println("Fibonnaci seeking " + n.toString())
    val res = fib(6)
    println(res)

}