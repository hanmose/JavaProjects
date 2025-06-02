package chapter07.rabbit;

import java.util.Scanner;

public class rabbitLAB1 {
    public static void main(String[] args) {
        Rabbit rabbi = new Rabbit();
        int x,y;
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        y = input.nextInt();
        rabbi.setPosition(x,y);
        rabbi.move();
    }
}
