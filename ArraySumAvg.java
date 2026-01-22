package JavaDay3;

public class ArraySumAvg {
    public static void main(String[] args) {

        double[] scores = {90.5, 88.0, 95.5, 78.0, 92.0};
        double sum = 0.0;
        for (double score : scores) {
            sum += score;
        }
        double avg = sum / scores.length;
        System.out.println("sum=" + sum);
        System.out.printf("avg=%.1f\n" , avg);
    }
}
