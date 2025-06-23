package chapter08.section02.lab_section2;

import java.util.Scanner;

public class Car {
    int speed;
    public String kind ="";
    Scanner input = new Scanner(System.in);

    public void Speed(int speed) {
        this.speed = speed;
    }
    public void print(){
        System.out.printf("%s %d\n",kind,this.speed);
    }
}
