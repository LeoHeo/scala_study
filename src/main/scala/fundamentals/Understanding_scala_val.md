## Understand about Scala concerning the meaning of val
> These three lines of code illustrate an important concept to understand about Scala concerning the meaning of val. Whenyou define a variable with val, the variable can't be reassigned, but the object to which it refers could potentially still bechanged. So in this case, you couldn't reassign greetStrings to a different array; greetStrings will alwayspoint to the same Array[String] instance with which it was initialized. But you can change the elementsof that Array[String] over time, so the array itself is mutable.


- Scala에서 val로 지정하면 그 변수를 재 할당 할 수 없다. 하지만 그 변수가 나타내는 객체는 잠재적으로 여전히 변경 가능하다.


```scala
val greetStrings = new Array[String](3)

greetStrings(0) = "Hello"
greetStrings(0) = "Bye" // 가능

// greetString = new Array[String](3) -> compile error
```
