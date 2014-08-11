
/** Module for calculating fib */
object FibModule {

  def fib(n: Int) = {
    def go(acc: Int, accPrev: Int, n: Int): Int = {
      if (n <= 0) acc
      else go(acc + accPrev, acc, n - 1)
    }
    go(1, 0, n)
  }
}