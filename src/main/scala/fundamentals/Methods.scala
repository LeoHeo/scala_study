package fundamentals

/**
  * @author Heo, Jin Han
  * @since 2018-06-23
  */
object Methods {

  def main(args: Array[String]): Unit = {
    println(s"addWithBlock => ${addWithBlock(2, 3)}")
    println(s"add => ${add(2, 3)}")
    println(s"addReturnExplicit => ${addReturnExplicit(2, 3)}")
    println(s"addThenMultiply => ${addThenMultiply(1, 2)(3)}")
    println(s"Hello ${name}!")
    println(s"getSquareString => ${getSquareString(3.0)}")
  }

  def addWithBlock(x: Int, y: Int) = {
    x + y
  }

  def add(x: Int, y: Int) = x + y

  def addReturnExplicit(x: Int, y: Int): Int = {
    x + y
//    return x + y
//    return "2222" -> compile error
  }

  def addThenMultiply(x: Int, y: Int)(multiplier: Int) = (x + y) * multiplier

  def name: String = System.getProperty("user.name")

  def getSquareString(input: Double): String = {
    val square = input * input
    square.toString
  }
}
