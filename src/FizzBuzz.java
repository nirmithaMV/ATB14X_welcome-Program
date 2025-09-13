import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Entered number is");
        int num = input.nextInt();
        System.out.println("Entered the input number"+ num);
        if (num%3 ==0 && num%5==0) {
            System.out.println("FizzBusZZ");

        }
        else if (num %3 ==0)
        {
            System.out.println("Fizz");
        }
        else if (num%5 ==0)
        {
            System.out.println("Buz");
            
        }
        input.close();
    }
}
