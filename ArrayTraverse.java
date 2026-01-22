package JavaDay3;

public class ArrayTraverse {
    public static void main(String[] args) {
        int arr[]={8,2,9,4,7};
        System.out.println("普通for循环遍历数组");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("foreach循环遍历数组");
        for(int num : arr){
            System.out.print(num+" ");
        }
    }
}
