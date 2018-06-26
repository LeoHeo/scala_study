package fundamentals.classes

/**
  * @author Heo, Jin Han
  * @since 2018-06-23
  */
class Greeter(prefix: String, suffix: String) {
  def greet(name: String) = {
    println(s"${prefix} ${name}, ${suffix}")
  }

}
