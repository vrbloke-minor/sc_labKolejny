package ex2

object main extends App {
  val l = new Logger with Quote with TimeStamp

  l.pprint("Hello world")

  println("")

  val ql = new Logger with Quote

  ql.pprint("No date, just quote")

  println("")

  val tl = new Logger with TimeStamp

  tl.pprint("Some time stamped message")

  println("")

  val plain = new Logger

  plain.pprint("Just he text")

  println("")
}
