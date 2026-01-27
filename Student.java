package JavaDay3.JavaDay4.JavaDay5.JavaDay6.JavaDay7;

public class Student {
    String name;
    int age;
    public Student(){

    }
    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void study(){
        System.out.println(name+"正在学习java面向对象");
    }
    public void showInfo(){
        System.out.println("姓名："+name+",年龄："+age);
    }
}
