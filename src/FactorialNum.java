import java.util.Scanner;
public class FactorialNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int fact=1;
        if (n== 0){
            fact=1;
        }
        for (int i = n; i >=1 ; i--) {
            fact =fact*i;
            
        }
        System.out.println(fact);
    }
}
