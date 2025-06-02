package chapter07;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

        car1.setName("아이오닉9");
        car1.setPrice(70000000);
        car1.setProduct("현대 자동차");
        car1.setCc(3000);
        car1.setYear(2025);

        car2.setName("X7");
        car2.setPrice(170000000);
        car2.setProduct("BMW");
        car2.setCc(3500);
        car2.setYear(2024);

        car3.setName("EV6");
        car3.setPrice(60000000);
        car3.setProduct("기아자동차");
        car3.setCc(2000);
        car3.setYear(2023);

        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(car3.toString());

        System.out.println(car1.getName()+"출발");
        car1.start();
        car1.drive(60);
        car1.forward();
        car1.stop();
    }

}
