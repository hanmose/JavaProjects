package chapter08.section02;

public class RabbitTest {
    public static void main(String[] args) {
        HouseRabbit h1 = new HouseRabbit();
        MountainRabbit m1 = new MountainRabbit();
//      superclass와 subclass가 같은 패키지내에 있을 때 접근하려면: public, default, protected
//      superclass와 subclass가 다른 패키지내에 있을 때 접근하려면: public, protected
        h1.ownerName = "한모세";
        h1.shape = "세모";
        h1.move(50,70);
        h1.eatFeed();

        m1.MountainName ="남산";
        m1.shape = "네모";
        m1.move(200,700);
        m1.eatFeed();
    }
}
