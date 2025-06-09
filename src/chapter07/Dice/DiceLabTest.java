package chapter07.Dice;

public class DiceLabTest {
    public static void main(String[] args) {
        Dice d1 = new Dice();
        Dice d2 = new Dice();
        Dice d3 = new Dice();

        int count = 0;

        while (true) {
            count++;
            d1.setNumber((int)(Math.random()*6+1));
            d2.setNumber((int)(Math.random()*6+1));
            d3.setNumber((int)(Math.random()*6+1));

            if (d1.getNumber() == d2.getNumber() && d1.getNumber() == d3.getNumber()) {
                break;

            }
        }

        System.out.printf("주사위가 모두 %d 입니다", d1.getNumber());
        System.out.printf("주사위를 총 %d번 던졌습니다", count);
    }
}
