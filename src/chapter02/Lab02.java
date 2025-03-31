package chapter02;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab02 {
    public static void main(String[] args) {
        System.out.println("===     단순계산기     ===");
        System.out.println("첫 번째 정수 값을 입력하세요");
        Scanner one = new Scanner(System.in);
        int one1 = one.nextInt();

        System.out.println("두 번째 정수 값을 입력하세요");
        Scanner two = new Scanner(System.in);
        int two2 = two.nextInt();

        int resPlus = one1 + two2;
        int resMinus = one1 - two2;
        int resMultply = one1 * two2;
        int resDivide = one1 / two2;
        int resMod = one1 % two2;

        System.out.printf("%d + %d = %d\n" , one1 , two2 , resPlus );
        System.out.printf("%d - %d = %d\n" , one1 , two2 , resMinus );
        System.out.printf("%d * %d = %d\n" , one1 , two2 , resMultply );
        System.out.printf("%d / %d = %d\n" , one1 , two2 , resDivide );
//        System.out.printf("%d %% %d = %d\n" , one1 , two2 , resMod );
        System.out.println(one1 + " % " + two2 + " = " + resMod );

        one.close();
        two.close();
    }
}
