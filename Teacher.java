package JavaDay3.JavaDay4.JavaDay5.JavaDay6.JavaDay7.JavaDay8;

public class Teacher extends Person{
    private String course;
    public String getCourse(){
        return course;
    }
    public void setCourse(String course){
        this.course = course;
    }
    @Override
    public void eat(){
        System.out.println("老师吃吃吃");
    }
}
