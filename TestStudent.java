package JavaDay3.JavaDay4.JavaDay5.JavaDay6.JavaDay7;

public class TestStudent {
    public static void main(String[] args){
        Student stu1 = new Student();
        stu1.name = "张三";
        stu1.age = 18;
        stu1.showInfo();
        stu1.study();
        System.out.println("==================");
        Student stu2 = new Student("李四",19);
        stu2.showInfo();
        stu2.study();
    }
}
