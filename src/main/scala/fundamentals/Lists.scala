package fundamentals

/**
  * @author Heo, Jin Han
  * @since 2018-06-28
  */
object Lists {
  def main(args: Array[String]): Unit = {
    val oneTwo = List(1, 2)
    val ThreeFour = List(3, 4)

    // List 내용을 변경하는 것 같아 보이는 메소드를 호출하면
    // 리스트 자체를 변경하지 않고 새 값을 갖는 리스트를 새로 만들어서 반환
    // 리스트에 있는 ::: 라는 메소드는 두 리스트를 이어 붙인다.
    val oneTwoThreeFour = oneTwo ::: ThreeFour
    println(s"${oneTwo} and ${ThreeFour} were not mutated")
    println(s"Thus, ${oneTwoThreeFour} is a new list")


    // ::(cons) 라고 부른다.
    // 콘즈는 새 원소를 기존 리스트의 맨 앞에 추가한 새 리스트를 반환한다.
    // 콘즈는 피연산자인 리스트 twoThree의 메소드이다.
    // 메소드 이름이 콜론(:)으로 끝나면 연산자 방식으로 사용시
    // 오른쪽 피연산자에 대해 호출을 한다.
    // twoThree.::(1)로 해석된다.
    val twoThree = List(2, 3)
    val oneTwoThree = 1 :: twoThree

    println(oneTwoThree)

    // 1 :: twoThree 처럼 왜 앞에 추가하는가?
    // List 뒤에 원소를 추가하는 연산은 리스트의 길에 비례하는 시간이 걸린다.
    // 반면 ::를 사용해 맨 앞에 추가하는데는 상수 시간이 걸린다.

  }
}
