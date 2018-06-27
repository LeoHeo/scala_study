package fundamentals

/**
  * @author Heo, Jin Han
  * @since 2018-06-27
  */
object Functional {
  def main(args: Array[String]): Unit = {
    val strings = Array("foo", "bar")
    val res = formatArgs(strings)
    assert(res == "foo\nbar") // 실패 일 경우 AssertionError
  }

  /**
    * imperative
    * @param args
    */
  def printArgs(args: Array[String]): Unit = {
    var i = 0
    while (i < args.length) {
      println(args(i))
      i += 1
    }
  }

  /**
    * without var
    * @param args
    */
  def printArgs2(args: Array[String]): Unit = {
    for (arg <- args) {
      println(arg)
    }
  }

  /**
    * Side Effect Functional
    * 표준 출력 스트림에 글자를 찍는 것이 side effect
    * side effect가 있는 함수를 나타내는 분명한 지표는
    * return type Unit
    * @param args
    */
  def printArgs3(args: Array[String]): Unit = {
    args.foreach(println)
  }

  /**
    * Functional
    * mkString은 iterable collection(배열, 리스트, 집합, 맵)에 호출 가능
    * toString을 각 우너소에 호출해서 얻은 문자열 사이에 인자로 넘긴 문자열을 끼워 반환
    * @param args
    * @return
    */
  def formatArgs(args: Array[String]) = args.mkString("\n")
}
