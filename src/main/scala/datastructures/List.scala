package datastructures

sealed trait List[+A]
case object Nil extends List[Nothing]
case class Cons[+A](head: A, tail: List[A]) extends List[A]

object List {
  def sum(ints: List[Int]): Int = ints match {
    case Nil         => 0
    case Cons(x, xs) => x + sum(xs)
  }

  def product(ds: List[Double]): Double = ds match {
    case Nil              => 1.0
    case Cons(0.0, _)     => 0.0
    case Cons(head, tail) => head * product(tail)
  }

  def apply[A](as: A*): List[A] =
    if (as.isEmpty) Nil else Cons(as.head, apply(as.tail: _*))

  /*
   Nilのときはtailのときに処理を続行すべき？
   Eitherとかtry使えばいい
   non emptyListにしてもいい
   */
  def tail[A](as: List[A]): List[A] = as match {
    case Nil           => sys.error("empty list")
    case Cons(_, tail) => tail
  }
}
