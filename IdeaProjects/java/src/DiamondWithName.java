import java.util.Scanner;
public class DiamondWithName {
    public static void main(String[] swt)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int index = 1;
        for(int i = 1;i < n;i++)
        {
            for(int j = n-1;j >= i;j--)
                System.out.print(" ");
            for(int k = 1;k <= index;k++)
                System.out.print("*");
            System.out.println();
            index = index + 2;
        }
        System.out.println("swathi");
        index = index - 2;
        for(int i = 1;i <= n;i++)
        {
            for(int j = 1;j <= i;j++)
                System.out.print(" ");
            for(int k = 1;k <= index;k++)
                System.out.print("*");
            System.out.println();
            index = index - 2;
        }
    }
}
