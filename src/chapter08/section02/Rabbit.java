package chapter08.section02;

public class Rabbit {
    String shape;
    int x,y;

    public Rabbit() {
        super();
        System.out.println("1. Rabbit의 생성자가 실행됨.");
    }

    void move(int x, int y){
        this.x=x;
        this.y=y;
        System.out.printf("(%d %d)좌표로 이동합니다.\n", this.x, this.y);
    }


}
