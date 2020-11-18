package ex2

trait Quote extends Printable {
  abstract override def pprint(msg: String): Unit = {
    print("\"")
    super.pprint(msg)
    print("\"")
  }
}
