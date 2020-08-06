package gettingstarted.GettingStarted

class GettingStarted {
  def fib(n: Int): Int = {
    def loop(n: Int, last: Int, cur: Int): Int = {
      if (n == 0) last
      else loop(n - 1, cur, last + cur)
    }
    loop(n, 0, 1)
  }

  def factorial(n: Int): Int = {
    def go(n: Int, acc: Int): Int =
      if (n <= 0) acc
      else go(n - 1, n * acc)

    go(n, 1)
  }
}

object MyModile {
  def abs(n: Int): Int =
    if (n < 0) -n
    else n

  private def formatAbs(x: Int) = {
    val msg = "The absolute value of %d is %d"
    msg.format(x, abs(x))
  }

  def main(args: Array[String]): Unit = {}

  private def fib(n: Int): Int = {
    val n0 = 0
    val n1 = 1
    @annotation.tailrec
    def loop(n: Int, x: Int, y: Int): Int = {
      if (n == 0) x
      else {
        loop(n - 1, y, x + y)
      }
    }
    loop(n, n0, n1)
  }

  def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {
    @annotation.tailrec
    def go(n: Int): Boolean = {
      if (n >= as.length - 1) true
      // orderedの中身の条件式ってどこで決まってるの？？
      else if (ordered(as(n), as(n + 1))) false
      else go(n + 1)
    }
    go(0)
  }

  // カリー化よくわからない
  def curry[A, B, C](f: (A, B) => C): A => (B => C) =
    (a: A) => (b: B) => f(a, b)

  // f(a)(b) is 何？
  def uncurry[A, B, C](f: A => B => C): (A, B) => C = (a: A, b: B) => f(a)(b)

  def compose[A, B, C](f: B => C, g: A => B): A => C = (a: A) => f(g(a))
}
