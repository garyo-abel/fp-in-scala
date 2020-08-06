package hackerRank

object Sample {

  def main(args: Array[String]) {
    println(io.Source.stdin.getLines().take(2).map(_.toInt).sum)
  }

  def soleveMeFirst(a: Int, b: Int): Int = {
    a + b
  }
}
