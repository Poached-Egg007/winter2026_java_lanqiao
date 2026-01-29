package JavaDay3.JavaDay4.JavaDay5.JavaDay6.JavaDay7.JavaDay8;

public class TestExtends {
    public static void main(String[] args){
        Student1 stu = new Student1();
        stu.setName("张三");
        stu.setAge(18);
        stu.setStudnetId("2019001");
        System.out.println("学生信息："+stu.getName()+","+stu.getAge()+"岁,学号："+stu.getStudentId());
        stu.eat();
        System.out.println("==================");
        Teacher tea  = new Teacher();
        tea.setName("王老师");
        tea.setAge(30);
        tea.setCourse("Java");
        System.out.println("老师信息："+tea.getName()+","+tea.getAge()+"岁,课程："+tea.getCourse());
        tea.eat();
    }
}
