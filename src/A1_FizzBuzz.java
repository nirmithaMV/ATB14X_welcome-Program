public class A1_FizzBuzz {
    public static void main(String[] args) {

        for(int num=1;num<=100;num++)
        {
            if(num%3==0 && num%5==0)
            {
                System.out.println("FizzBuzz");
            }
            else if(num%3==0)
            {
                System.out.println("Fiz");
            }
            else if(num%5==0)
            {
                System.out.println("Buzz");
            }
            else
            {
                System.out.println("the number entered is " +num+" and it is not modules of 3 and 5");
            }
        }

    }
}
