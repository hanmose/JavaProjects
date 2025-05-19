package chapter06;

import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        int number;
        int computer;
        Scanner sc = new Scanner(System.in);
        int count = 1;
        while(true) {
            if (count == 11) {
                break;
            }
            System.out.println("1~5 사이의 정수를 입력하세요");
            number = sc.nextInt();
            computer = (int)(Math.random()*5+1);

            if(number == computer) {
                System.out.println("정답입니다 축하해요!");
                break;
            }

            System.out.printf("%d회: 틀렷습니다 %d 였어요\n",count,computer);
            count++;
        }


    }
}
