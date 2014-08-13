
/** Module for exercise 4 */
object Ex4 {

  def uncurry[A,B,C](f: A => B => C): (A, B) => C = {
    (a, b) => f(a)(b)
  }

}