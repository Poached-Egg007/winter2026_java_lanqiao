package JavaDay2;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int target = (int)(Math.random()*100)+1;
        Scanner sc = new Scanner(System.in);
        System.out.println("====猜数字游戏====");
        while(true){
            System.out.print("请输入你猜的数字：");
            int guess = sc.nextInt();
            if(guess == target){
                System.out.println("恭喜你，猜对了！");
                break;
            }else if(guess > target){
                System.out.println("你猜的数字太大了！");
            }else{
                System.out.println("你猜的数字太小了！");
            }
        }
        sc.close();
    }
}
