package chapter05;

import java.util.Scanner;

public class Code5_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("========== 학점 프로그램 ==========\n");

        System.out.println("* 성적을 정수로 입력: ");

        int score = sc.nextInt();
        String resultStr = "";
        if (score >= 90) {
            resultStr ="A";
        }
        else if (score >= 80) { //score < 90 && socre >=80
            resultStr = "B";
        }
        else if (score >= 70) { //score < 80 && socre >=70
            resultStr = "C";
        }
        else if (score >= 60) {
            resultStr = "D";
        }
        else{
            resultStr = "F";
        }

        System.out.printf("* %d점은 %s학점입니다",score, resultStr);
        sc.close();
    }
}
