package fundamentals

/**
  * @author Heo, Jin Han
  * @since 2018-06-23
  */
object Functions {
  def main(args: Array[String]): Unit = {
    println(s"addOne => ${addOne(1)}")
    println(s"add => ${add(2, 3)}")
    println(s"getTheAnswer => ${getTheAnswer()}")
  }

  val addOne = (x: Int) => x + 1

  val add = (x: Int, y: Int) => x + y

  val getTheAnswer = () => 42
}
