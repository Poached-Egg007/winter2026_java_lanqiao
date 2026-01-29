package JavaDay3.JavaDay4.JavaDay5.JavaDay6.JavaDay7.JavaDay8;

public class TestStudentEncapsulation {
    public static void main(String[] args){
        Student stu = new Student();
        stu.setName("小明");
        stu.setAge(20);
        stu.showInfo();
        System.out.println("==================");
        stu.setAge(200);
        stu.showInfo();
    }
}
