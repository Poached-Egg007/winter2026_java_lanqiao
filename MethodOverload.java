package JavaDay3.JavaDay4.JavaDay5;

public class MethodOverload {
    public static int getMax(int a,int b){
        return a>b?a:b;
    }
    public static int getMax(int a,int b,int c){
        int temp = getMax(a,b);
        return getMax(temp,c);
    }
    public static double getMax(double a,double b){
        return a>b?a:b;
    }
    public static void main(String[] args) {
        System.out.println("两个int的最大值："+getMax(1,2));
        System.out.println("三个int的最大值:"+getMax(1,2,3));
        System.out.println("两个double的最大值："+getMax(1.1,2.2));
    }
}
