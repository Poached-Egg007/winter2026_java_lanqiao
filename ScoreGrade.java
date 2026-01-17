import java.util.Scanner;

public class ScoreGrade {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入学生分数（0~100）：");
        int score = sc.nextInt();

        if (score<0||score>100){
            System.out.println("输入分数不合理");
        }else if(score>=90){
            System.out.println("A");
        }else if(score>=80){
            System.out.println("B");
        }else if(score>=70){
            System.out.println("C");
        }else if(score>=60){
            System.out.println("D");
        }else{
            System.out.println("E");
        }
        sc.close();
    }
}
