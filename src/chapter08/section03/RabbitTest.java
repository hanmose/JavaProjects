package chapter08.section03;

public class RabbitTest {
    public static void main(String[] args) {
//        Rabbit rabiit = new Rabbit(); 추상이는 new연산자로 객체생성 불가능
        HouseRabbit h = new HouseRabbit();
        MountainRabbit m = new MountainRabbit();

        h.move(10,20);
        m.move(1000,2000);

        m.run();

        h.eat("grasses");
        h.shape ="Circle";
    }
}
