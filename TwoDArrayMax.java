package JavaDay3.JavaDay4;

public class TwoDArrayMax {
    public static void main(String[] args) {
        int[][] arr={{8,3,5},{12,9,6},{7,15,10}};
        int max = arr[0][0];
        int maxRow = 0;
        int maxCol = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]>max){
                    max = arr[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }
        System.out.println("最大值是：" + max);
        System.out.println("最大值所在行索引是：" + maxRow);
        System.out.println("最大值所在列索引是：" + maxCol);
    }
}
