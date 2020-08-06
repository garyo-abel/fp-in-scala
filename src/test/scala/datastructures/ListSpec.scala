package datastructures

import org.scalatest.funspec.AnyFunSpecLike

class ListSpec extends AnyFunSpecLike {
  describe("Q. 3.1") {
    it("answer") {
      val x = List(1, 2, 3, 4, 5) match {
        case Cons(x, Cons(2, Cons(4, _))) =>
          println(x)
          x
        case Nil =>
          println(42)
          42
        case Cons(x, Cons(y, Cons(3, Cons(4, _)))) =>
          println(x + y)
          x + y
        case _ =>
          println(101)
          101
      }
      assert(x == 3)
    }
  }

  describe("Q. 3.2") {
    it("answer") {
      val result = List.tail(List(1, 2, 3, 4, 5))
      assert(result == List(2, 3, 4, 5))
    }
  }
}
