package chapter06;

public class ForTest9 {
    public static void main(String[] args) {
        for (int k = 1;k<=9;k++) {
            for (int i = 2;i<=9;i++) {
                System.out.printf("%d × %d = %2d| ", i, k, i * k);
            }
            System.out.println("");
        }
    }
}
