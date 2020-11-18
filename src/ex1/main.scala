package ex1
import math.Pi

object main extends App {
  val test: Angle = Angle(3*Pi)
  println(test.phi)
  println((test*5).phi)
  println((test+Angle(Pi)).phi)
}
