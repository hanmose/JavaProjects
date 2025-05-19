package chapter06;

import java.util.Random;

public class Dice {
    public static void main(String[] args) {
        Random random = new Random();

        int dice1;
        int dice2;
        int dice3;
        int i = 1;
        while(true)
        {
            dice1 = random.nextInt(1,7);
            dice2 = random.nextInt(1,7);
            dice3 = random.nextInt(1,7);
            if(dice1==dice2 && dice1==dice3){
                break;
            }
            i++;
        }
        System.out.println("3개의 주사위는 모두 " + dice1+"입니다");
        System.out.println("총 "+i+"번 던졌습니다");
    }
}
