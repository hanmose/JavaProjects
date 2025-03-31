package chapter02;

import java.util.Scanner;

public class Lab01 {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        Scanner adr = new Scanner(System.in);
        Scanner gram = new Scanner(System.in);
//이름
        System.out.println("## 택배 보내기입니다. 다음을 각각 입력하세요 ##");
        System.out.println("받는 사람 : ");
        String name1 = name.nextLine();
//주소
        System.out.println("주소 : ");
        String addr = adr.nextLine();
//무게
        System.out.println("무게(g) : ");
        int ggram = gram.nextInt();
//출력
        int price = ggram * 5;
        System.out.println("받는 사람 ==> " + name1+"님");
        System.out.println("받는 분 주소 ==> " + addr);
        System.out.println("배송비 ==> " + price + "원");

        name.close();
        adr.close();
        gram.close();

    }
}
