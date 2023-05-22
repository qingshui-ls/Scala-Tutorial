package chapter05

object LambdaTest {
  def main(args: Array[String]): Unit = {
    /* val fun = (name: String) => {
       println(name)
     }
     fun("atguigu")*/

    // 定死数据，选择操作
    /*def f(func: String => Unit): Unit = {
      func("hello")
    }

    f(fun)
    f(println(_))
    f(println)*/
    def f(n: Int) = n
    f(1)
    def f2(): Int =1
    def f3: ()=>Int = f2

    val f1 = f _
    println(f1(5))
    val f4 = f3
    val f5 = f3 _
    println(f4)
    println(f5)
  }





}
