package chapter07.access;

public class RabbitPrivateTest {
    public static void main(String[] args) {
        Rabbit r1 = new Rabbit();
        r1.setShape("Rectangle");
        r1.setPosition(50,100);
        System.out.println("토끼 모양: "+ r1.getShape());
        System.out.printf("토끼 현재 위치: (%d, %d)\n", r1.getX(), r1.getY());
    }
}
