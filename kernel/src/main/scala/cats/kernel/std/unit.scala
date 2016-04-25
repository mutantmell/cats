package cats.kernel
package std

package object unit extends UnitInstances

trait UnitInstances {
  implicit val unitAlgebra: Order[Unit] with BoundedSemilattice[Unit] =
    new UnitAlgebra
}

class UnitAlgebra extends Order[Unit] with BoundedSemilattice[Unit] {
  def compare(x: Unit, y: Unit): Int = 0

  override def eqv(x: Unit, y: Unit): Boolean = true
  override def neqv(x: Unit, y: Unit): Boolean = false
  override def gt(x: Unit, y: Unit): Boolean = false
  override def lt(x: Unit, y: Unit): Boolean = false
  override def gteqv(x: Unit, y: Unit): Boolean = true
  override def lteqv(x: Unit, y: Unit): Boolean = true

  override def min(x: Unit, y: Unit): Unit = ()
  override def max(x: Unit, y: Unit): Unit = ()

  def empty: Unit = ()
  def combine(x: Unit, y: Unit): Unit = ()
  override protected[this] def repeatedCombineN(a: Unit, n: Int): Unit = ()
  override def combineAllOption(as: TraversableOnce[Unit]): Option[Unit] =
    if (as.isEmpty) None else Some(())
}
