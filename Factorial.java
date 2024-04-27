package practical;

import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        int n, fact = 1;
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter a no to check its Factorial : ");
        n = ip.nextInt();
        for(int i = 1; i <=n; i++){
            fact = fact * i;
        }
        System.out.println("Factorial of " + n + " = " + fact);
    }
}
