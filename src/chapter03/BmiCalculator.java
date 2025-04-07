package chapter03;
import java.util.Scanner;
public class BmiCalculator {
    public static void main(String[] args) {

        Scanner bmi = new Scanner(System.in);

        System.out.println("체중(kg)을 입력하세요:");
        double kg = bmi.nextDouble();

        System.out.println("신장(cm)를 입력하세요:");
        double cm = bmi.nextDouble();

        double ybmi = kg / Math.pow((cm/100),2);

        System.out.printf("당신은 체중 %.0fkg, 신장 %.0fcm이므로 BMI 지수가 %.0f kg/m² 입니다.", kg , cm , ybmi);


    }
}
