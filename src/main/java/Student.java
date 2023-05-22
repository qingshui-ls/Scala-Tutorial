import javax.sound.midi.Soundbank;

public class Student {
    private String Name;
    private Integer age;
    private static String school = "ecust";

    public Student(String name, Integer age) {
        Name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", age=" + age + ", school=" + school +
                '}';
    }

    public static void main(String[] args) {
        Student zs = new Student("zs", 1);
        Student ls = new Student("ls", 2);
        System.out.println(zs.toString());
        System.out.println(ls.toString());
    }
}
