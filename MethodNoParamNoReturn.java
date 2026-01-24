package JavaDay3.JavaDay4.JavaDay5;

public class MethodNoParamNoReturn {
    public static void printHello(){
        System.out.println("hello world");
        System.out.println("方法封装了可复用的代码块");
    }
    public static void main(String[] args) {
        System.out.println("第一次调用方法");
        printHello();
        System.out.println("第二次调用方法");
        printHello();
    }
}
