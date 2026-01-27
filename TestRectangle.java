package JavaDay3.JavaDay4.JavaDay5.JavaDay6.JavaDay7;
import java.util.Scanner;
public class TestRectangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入矩形的长：");
        double len = sc.nextDouble();
        System.out.print("请输入矩形的宽：");
        double wid = sc.nextDouble();

        Rectangle rect = new Rectangle(len,wid);
        double area = rect.getArea();
        double perimeter = rect.getPerimeter();

        System.out.println("矩形的面积是："+area);
        System.out.println("矩形的周长是："+perimeter);
        sc.close();
    }
}
