package JavaDay3.JavaDay4.JavaDay5.JavaDay6;

public class RecursionHanoi {
    public static void hanoi(int n, char a, char b, char c) {
        // 1. 终止条件：只有1个圆盘，直接移动
        if (n == 1) {
            System.out.println(a + " -> " + c);
            return;
        }
        // 2. 递推关系
        // 步骤1：n-1个圆盘从a移到b，借助c
        hanoi(n - 1, a, c, b);
        // 步骤2：第n个圆盘从a移到c
        System.out.println(a + " -> " + c);
        // 步骤3：n-1个圆盘从b移到c，借助a
        hanoi(n - 1, b, a, c);
    }

    public static void main(String[] args) {
        int n = 4; // 3个圆盘
        System.out.println("移动" + n + "个圆盘的步骤：");
        hanoi(n, 'A', 'B', 'C');
    }
}
