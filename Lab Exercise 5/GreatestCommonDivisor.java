import java.util.Scanner;

public class GreatestCommonDivisor {
    static int getGCD(int a, int b) {
        while (a > 0 && b > 0) {
            if (a > b) {
                a = a % b;
            }
            else {
                b = b % a;
            }
        }
        if (a == 0) {
            return b;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter first integer: ");
        int num1 = scan.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = scan.nextInt();

        System.out.println( "The greatest common divisor for " + num1 + 
                            " and " + num2 + " is " + getGCD(num1, num2));
        
        scan.close();
    }    
}
