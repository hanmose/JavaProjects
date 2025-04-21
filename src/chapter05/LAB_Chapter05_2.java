package chapter05;

import java.util.Scanner;

public class LAB_Chapter05_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("============ 가위,바위,보 게임 ============");
        System.out.println("* 가위,바위,보 중에 하나를 입력: ");
        String myhand = sc.nextLine();

        String[] hands = {"가위", "바위", "보"};
        int random = (int) (Math.random() * hands.length);
        String computerHand = hands[random];
        System.out.println("당신은"+myhand);
        System.out.println("컴퓨터는"+computerHand);

        if (myhand.equals("가위")) {
            if (computerHand.equals("가위")) {
                System.out.println("비겼습니다");
            } else if (computerHand.equals("바위")) {
                System.out.println("졌습니다");
            } else {
                System.out.println("이겼습니다");
            }
        }

        if (myhand.equals("바위")) {
            if (computerHand.equals("바위")) {
                System.out.println("비겼습니다");
            } else if (computerHand.equals("보")) {
                System.out.println("졌습니다");
            } else {
                System.out.println("이겼습니다");
            }
        }

        if (myhand.equals("보")) {
            if (computerHand.equals("보")) {
                System.out.println("비겼습니다");
            } else if (computerHand.equals("가위")) {
                System.out.println("졌습니다");
            } else {
                System.out.println("이겼습니다");
            }
        } else {
            System.out.println("가위, 바위, 보 문자열 중에 하나를 입력해 주세요: ");
        }
        sc.close();
    }

}



