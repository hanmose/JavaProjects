package chapter08.section01;

public class RabbitTest1 {
    public static void main(String[] args) {
        System.out.printf("Rabbit 객체 생성 전의 토끼 객체의 수: %d\n", Rabbit.count);

        Rabbit r1 = new Rabbit();
        System.out.printf("Rabbit 객체 첫번째 생성 후의 토끼 객체의 수: %d\n", Rabbit.count);
        Rabbit r2 = new Rabbit();
        System.out.printf("Rabbit 객체 두번째 생성 후의 토끼 객체의 수: %d\n", Rabbit.count);
    }
}
