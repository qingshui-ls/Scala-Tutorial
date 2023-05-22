package chapter01

/*  object :关键字，声明一个单例对象(伴生对象)
  main从外部直接调用执行的方法
  语法：
  def functionName(argsName : Array[String]): 返回值类型(Unit) ={
    方法体
  }

* */
object HelloWorld {

  def main(args: Array[String]): Unit = {
    println("hello world")
    System.out.print("hello scala from java")
  }
}
