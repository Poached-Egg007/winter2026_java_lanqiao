package JavaDay3.JavaDay4.JavaDay5.JavaDay6.JavaDay7;

public class Rectangle {
    double length;
    double width;
    public Rectangle(double length,double width){
        this.length = length;
        this.width = width;
    }
    public double getArea(){
        return length*width;
    }
    public double getPerimeter(){
        return (length+width)*2;
    }
}
