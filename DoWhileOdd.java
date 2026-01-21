package JavaDay2;

public class DoWhileOdd {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("1到10的奇数有：");
        do{
            if(i%2!=0){
                System.out.print(i+" ");
            }
            i++;
        }while(i<=10);

    }
}
