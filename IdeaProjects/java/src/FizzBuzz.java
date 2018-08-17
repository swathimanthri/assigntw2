public class FizzBuzz {
    public static void main(String[] swt)
    {
        FizzBuzz f = new FizzBuzz();
        f.FIZZBUZZ();
    }
    public void FIZZBUZZ()
    {
        for(int i = 1;i <= 100;i++)
        {
            if(i % 3 == 0) {
                System.out.print("Fizz");
                if (i % 5 == 0)
                    System.out.print("Buzz");
            }
            else if(i%5 == 0)
                System.out.print("Buzz");
            else
                System.out.print(i);
            System.out.println();
        }
    }
}
