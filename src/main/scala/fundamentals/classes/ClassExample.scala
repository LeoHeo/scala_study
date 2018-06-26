package fundamentals.classes

/**
  * @author Heo, Jin Han
  * @since 2018-06-23
  */
object ClassExample {
  def main(args: Array[String]): Unit = {

    // 일반 class는 new로 인스턴스를 만든다 -> 다른 주소
    val greeter = new Greeter("Hello", "See you!")
    greeter.greet("LeoHeo")

    // 같은 주소
    val point = Point(1, 2)
    val point2 = Point(1, 2)
    println(point == point2) // true

  }

  case class Point(x: Int, y: Int)
}
