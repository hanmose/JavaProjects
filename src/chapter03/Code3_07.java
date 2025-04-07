package chapter03;

import java.util.Scanner;

public class Code3_07 {
    public static void main(String[] args) {
        Scanner lb = new Scanner(System.in);
        Scanner kg = new Scanner(System.in);

        System.out.println("파운드(lb)를 입력하세요: ");
        int num1 = lb.nextInt();

        System.out.println("킬로그램(kg)를 입력하세요: ");
        int num2 = kg.nextInt();

        double sum1 = num1 * 0.453592;
        double sum2 = num2 * 2.204623;

        System.out.printf("%dlb 는 %fkg 입니다.\n ", num1 , sum1);
        System.out.printf("%dkg 는 %flb 입니다.\n ", num2 , sum2);

    }
}
