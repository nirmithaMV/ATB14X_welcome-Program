import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Entered number is");
        int num = input.nextInt();
        System.out.println("Entered the input number"+ num);
        for(int i=1;i<=num;i++)
        {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuZZ");

            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buz");

            }
            else{
                System.out.println(i);
            }
        }
        input.close();
    }
}
