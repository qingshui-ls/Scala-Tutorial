package chapter01

class Student(var name: String,val age: Int) {

  def printInfo(): Unit = {
    println("Name = " + " " + this.name + " age = " + age + " school = " + Student.school)
  }
}

// 引入伴生对象，解决没有static
object Student {
  val school: String = "ecust"

  def main(args: Array[String]): Unit = {
    new Student("ls",15).printInfo()
    new Student("xs",16).printInfo()
  }
}