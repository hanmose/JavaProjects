package Task;

public class ScoreAverage {
    public static void main(String[] args) {
        int java = 3, mobile = 2, excel = 1;

        double average = ((java*3.5) + (mobile*4.0) + (excel*4.5))/(java+mobile+excel);

        System.out.printf("평균 학점은 %.2f 입니다", average);
    }

}
