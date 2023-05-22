package chapter02

import chapter01.Student

object VariableTest {
  /*
  * （1）声明变量时，类型可以省略，编译器自动推导，即类型推导
  （2）类型确定后，就不能修改，说明 Scala 是强数据类型语言。
  （3）变量声明时，必须要有初始值
  （4）在声明/定义一个变量时，可以使用 var 或者 val 来修饰，var 修饰的变量可改变，
  val 修饰的变量不可改。

  * */
  def main(args: Array[String]): Unit = {
    var a: Int = 10
    val b: Int = 10
    val alice = new Student("alice", 20)
    alice.name = "bob"
    alice.printInfo()

    println(
      """
        |select * from 
        |
        |""".stripMargin)
  }

}
