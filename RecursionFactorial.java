package JavaDay3.JavaDay4.JavaDay5.JavaDay6;

public class RecursionFactorial {
    public static int factorial(int n){
        if(n==0||n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        System.out.println("5的阶乘是："+factorial(5));
    }
}
