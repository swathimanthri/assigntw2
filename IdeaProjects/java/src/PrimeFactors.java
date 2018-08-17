import java.util.Scanner;
import java.lang.Math;
public class PrimeFactors {
    public static void main(String[] swt)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        PrimeFactors p = new PrimeFactors();
        p.generate(n);
    }
    public void generate(int n)
    {
        if(n%2 == 0) {
            System.out.println("2");
            n = n/2;
        }
        for(int i = 3;i <= Math.sqrt(n);i = i+2)
        {
            while(n%i == 0)
            {
                System.out.println(i);
                n = n/i;
            }
        }
        if(n > 2)
            System.out.println(n);
    }
}
