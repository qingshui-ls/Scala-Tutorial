package chapter05

import scala.util.control.Breaks

// 控制抽象
object ControlAbstractTest {
  def main(args: Array[String]): Unit = {
    def test1(f: () => Unit): Unit = {
      f()
    }

    def test2(f: => Unit): Unit = {
      f
    }

    test1(
      () => {
        println("test1...")
      }
    )
    // 完整的参数传递，是将函数对象作为参数进行传递
    // 控制抽象，将代码作为参数进行传递
    // 如果参数跨越多行，那么可以将小括号改为大括号
    test2(
      println("test2...")
    )

    // 自定义语法时，采用控制抽象
    Breaks.breakable(
      for (i <- 1 to 5) {
        if (i == 3) {
          Breaks.break()
        }
        println("i = " + i)
      }
    )
  }

}
