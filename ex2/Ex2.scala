
/** Module for exercise 2 */
object Ex2 {

  def isSorted[A](as: Array[A], gt: (A,A) => Boolean): Boolean = {
    def loop(a: A, b: A, n: Int): Boolean = {
      if (gt(b, a)) false
      else if (n >= as.length) true
      else loop(as(n), a, n + 1)
    }

    if (as.length == 0) true
    else loop(as(0), as(0), 1)
  }
}