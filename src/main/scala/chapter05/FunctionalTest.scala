package chapter05

object FunctionalTest {
  def main(args: Array[String]): Unit = {
    sayHi("ls")
    val result = FunctionalTest.sayHi("ls")
    println(result)
    mmm()
    f3("a")
  }

  def sayHi(name: String): String = {
    println("你好" + name)
    return "hello"
  }

  def f3(sx: String) {
    println(sx)
    println(sx)
  }

  // 匿名函数，lambda表达式
  () => {
    println("aaa")
  }

  def mmm(): Unit = {
    for (elem <- 1 to 10) {
      if (elem % 2 == 1) {
        println(elem)
      } else {
        println("continue")
      }
    }
  }


}
