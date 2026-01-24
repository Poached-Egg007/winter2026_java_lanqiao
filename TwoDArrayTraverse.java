package JavaDay3.JavaDay4;

public class TwoDArrayTraverse {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println("双重for循环遍历");
        for(int i = 0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("增强for循环");
        for (int[]row:arr){
            for (int num :row){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
