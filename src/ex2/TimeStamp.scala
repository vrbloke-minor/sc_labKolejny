package ex2
import java.util.Calendar

trait TimeStamp extends Printable {
  abstract override def pprint(msg:String): Unit = {
    print(Calendar.getInstance.getTime + " ")
    super.pprint(msg)
  }
}
