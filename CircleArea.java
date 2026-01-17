import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入圆的半径：");
        double r = sc.nextDouble();
        final double PI = 3.14159;
        double area = PI * r * r;
        System.out.printf("圆的面积为：%.2f\n",area);
        sc.close();

    }
}
