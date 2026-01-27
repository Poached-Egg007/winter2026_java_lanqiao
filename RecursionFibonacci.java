package JavaDay3.JavaDay4.JavaDay5.JavaDay6;

public class RecursionFibonacci {
    public static int fib(int n){
        if(n==1||n==2){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.printf("斐波那契第%d项：%d\n",n,fib(n));
        System.out.print("前10项：");
        for(int i = 1;i<11;i++){
            System.out.print(fib(i)+" ");
        }
    }
}
