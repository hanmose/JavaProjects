package chapter03;

public class Lab {
    public static void main(String[] args) {
        int total = 0;

        total -= 900*10;
        total += 1800*2;
        total -= 3500*5;
        total += 4000*4;
        total += 1500;
        total += 2000*4;
        total += 1800*5;

        System.out.printf("오늘의 매출은 %d 원 입니다" , total);
    }
}
