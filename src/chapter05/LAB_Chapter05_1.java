package chapter05;

import java.util.Calendar;
import java.util.Scanner;

public class LAB_Chapter05_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================ PC방 출입 시간 제한 ================");
        System.out.println("* 출생년도 입력(4자리 정수로):  ");
        int bithYear = sc.nextInt();

        Calendar calendar = Calendar.getInstance();
        int nowYear = calendar.get(Calendar.YEAR);
        int age = nowYear - bithYear;
        String resultStr = "";

        if (age >= 18) {
        resultStr="즐거운 시간 보내세요~";
        }
        else {
            resultStr="집에 가실 시간입니다~";
        }
        System.out.println("귀하의 나이는"+age+"세 이므로 " + resultStr);
        System.out.println("협조해 주셔서 정말 감사합니다.");
        sc.close();
    }
}
