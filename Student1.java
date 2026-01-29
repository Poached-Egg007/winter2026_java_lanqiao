package JavaDay3.JavaDay4.JavaDay5.JavaDay6.JavaDay7.JavaDay8;

public class Student1 extends Person{
    private String studnetId;
    public String getStudentId(){
        return studnetId;
    }
    public void setStudnetId(String studnetId){
        this.studnetId = studnetId;
    }
    @Override
    public void eat(){
        System.out.println("学生吃吃吃");
    }
}
