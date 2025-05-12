package chapter06;

public class ForTestArray {
    public static void main(String[] args) {
        String[][] teamNames = {{"동해","물과","백두","산이"},{"마르","고닳","도록"},{"하느","님이","보우","하사"}};

        for(int i = 0;i<teamNames.length;i++)
        {
            System.out.print(i+1+"팀:");
            for (int j = 0;j<teamNames[i].length;j++)
            {
                System.out.printf("%s\t",teamNames[i][j]);
            }
            System.out.println();
        }
    }
}
