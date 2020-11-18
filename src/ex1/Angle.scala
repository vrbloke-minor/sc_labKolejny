package ex1
import math.Pi

class Angle(val phi: Double) {
  def +(rhs: Angle): Angle = Angle(phi + rhs.phi)
  def -(rhs: Angle): Angle = Angle(phi - rhs.phi)
  def *(rhs: Double): Angle = Angle(rhs*phi)
  def /(rhs: Double): Angle = Angle(rhs/phi)
}

object Angle {
  @scala.annotation.tailrec
  def apply(phi: Double): Angle = if(phi < -Pi) apply(phi + 2*Pi)
                                  else if(phi > Pi) apply(phi - 2*Pi)
                                  else new Angle(phi)
}
