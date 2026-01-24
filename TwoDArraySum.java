package JavaDay3.JavaDay4;

public class TwoDArraySum {
    public static void main(String[] args) {
        int sum = 0;
        int[][] arr ={{3,5,7},{2,4,6}};
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                sum += arr[i][j];
            }
        }
        System.out.println("二维数组的和是：" + sum);
    }
}
