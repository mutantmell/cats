package cats.kernel
package std

import java.lang.Math

trait DoubleInstances {
  implicit val doubleOrder: Order[Double] = new DoubleOrder
}

class DoubleOrder extends Order[Double] {

  def compare(x: Double, y: Double): Int =
    java.lang.Double.compare(x, y)

  override def eqv(x:Double, y:Double) = x == y
  override def neqv(x:Double, y:Double) = x != y
  override def gt(x: Double, y: Double) = x > y
  override def gteqv(x: Double, y: Double) = x >= y
  override def lt(x: Double, y: Double) = x < y
  override def lteqv(x: Double, y: Double) = x <= y

  override def min(x: Double, y: Double): Double =
    Math.min(x, y)
  override def max(x: Double, y: Double): Double =
    Math.max(x, y)
}
