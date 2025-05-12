package chapter06;

public class ForTest2 {
    public static void main(String[] args) {
        int x;
        x=0;

        for (int k = 0; k < 10; k++)
        {
        for (int i = 0; i < 10; i++,x++)
        {
            System.out.print(x + 1 + "\t");
        }
            System.out.println("");
        }
    }
}
