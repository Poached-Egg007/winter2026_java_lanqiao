package JavaDay3.JavaDay4.JavaDay5;

public class MethodWithParamWithReturn {
    public static int getSum(int a,int b){
        int sum = a+b;
        return sum;
    }
    public static void main(String[] args) {
        int result1 = getSum(10,20);
        System.out.println("10+20="+result1);
        int result2 = getSum(5,8);
        System.out.println("5+8="+result2);
        System.out.println("30+40="+getSum(30,40));
    }
}
