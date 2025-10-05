import java.util.Scanner;

public class Lab_Pallindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String input= sc.next();
        String rv="";
        for (int i=input.length()-1;i>=0;i--)
        {
            rv += input.charAt(i);
        }
        System.out.println("Reverse string is "+rv);

        if (rv == input)
        {
            System.out.println("The given input is Pallindrome  " +input);
        }
        else
        {
            System.out.println("The given input is not pallindrome " +input);
        }
    }
}
