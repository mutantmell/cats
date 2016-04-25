package cats.kernel
package std

package object int extends IntInstances

trait IntInstances {
  implicit val intOrder: Order[Int] = new IntOrder
}

class IntOrder extends Order[Int] {

  def compare(x: Int, y: Int): Int =
    if (x < y) -1 else if (x > y) 1 else 0

  override def eqv(x: Int, y: Int) = x == y
  override def neqv(x: Int, y: Int) = x != y
  override def gt(x: Int, y: Int) = x > y
  override def gteqv(x: Int, y: Int) = x >= y
  override def lt(x: Int, y: Int) = x < y
  override def lteqv(x: Int, y: Int) = x <= y

  override def min(x: Int, y: Int): Int =
    java.lang.Math.min(x, y)
  override def max(x: Int, y: Int): Int =
    java.lang.Math.max(x, y)
}
