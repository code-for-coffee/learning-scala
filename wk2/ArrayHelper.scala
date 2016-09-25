object ArrayHelper {
  // monomorphic
  def findFirstString(ss: Array[String], key: String): Int = {
    @annotation.tailrec
    def loop(n: Int): Int =
      if (n >= ss.length) -1    // 2. return -1 if n is >= ss.length
      else if (ss(n) == key) n  // 3. ss(n) extracts the element; return n = they match
      else loop(n + 1)          // 4. if no match, keep on looping

    loop(0) // 1. start loop from first element in array
  }

  // for any given type of A...
  // polymorphic
  def findFirst[A](as: Array[A], f: A => Boolean): Int = {
    // f: type of A => Boolean
    @annotation.tailrec
    def loop(n: Int): Int = {
      if (n >= as.length) -1
      else if (f(as(n))) n // function f matches current element! return n as index
      else loop(n + 1)
    }
    loop(0)
  }

  def isSorted[A](as: Array[A], f: (A,A) => Boolean): Boolean = {
    @annotation.tailrec
    def go(n: Int): Boolean = {
      if (n >= as.length - 1) true
      else if (f(as(n), as(n+1))) false
      else go(n+1)
    }
    go(0)
  }

  def main(args: Array[String]): Unit = {
    var names = Array("bob", "magda", "beth", "marshmello")
    println(findFirstString(names, "beth"))
    println(findFirst(names, (x: String) => x == "marshmello"))
    var nums = Array(1,2,3,4,5)
    var reverseNums = Array(5,4,3,2,1)
    println(isSorted(nums, (x: Int, y: Int) => x > y))
    println(isSorted(reverseNums, (x: Int, y: Int) => x < y))
  }

}