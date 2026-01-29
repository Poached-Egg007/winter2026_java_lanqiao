package JavaDay3.JavaDay4.JavaDay5.JavaDay6.JavaDay7.JavaDay8;

public class Student {
    private String name;
    private int age;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        if(age>0 && age <=150){
            this.age = age;
        }else{
            this.age = 0;
            System.out.println("年龄输入非法，已重置为0");
        }
    }
    public void showInfo(){
        System.out.println("姓名："+name+"年龄："+age);
    }
}
