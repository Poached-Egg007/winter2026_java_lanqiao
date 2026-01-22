package JavaDay3;

public class ArrayMax {
    public static void main(String[] args) {
        int[] arr ={12,45,7,89,34,99,56};
        int max = arr[0];
        int maxIndex = 0;
        for (int i = 0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
                maxIndex = i;
            }
        }
        System.out.println("最大值是：" + max);
        System.out.println("最大值索引是：" + maxIndex);
    }

}
