package chapter07.access;

public class RabbitPublicTest {
    public static void main(String[] args) {
        RabbitPublic r1 = new RabbitPublic();
        r1.shape = "Circle";
        r1.x = 70;
        r1.y = 30;

        System.out.printf("토끼 모양: %s\n", r1.shape);
        System.out.printf("토끼 현재 위치: (%d, %d)\n", r1.x, r1.y);
    }
}
