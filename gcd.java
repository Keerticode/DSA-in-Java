//Finding the greatest common divisor of given two numbers
//solved using Euclidean algorithm
import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n1 : ");
        int n1 = sc.nextInt();
        System.out.print("Enter the value of n2 : ");
        int n2 = sc.nextInt();
        while(n1 > 0 && n2 > 0) {
            if( n1 > n2) {
                n1 = n1 % n2;
            }
            else {
                n2 = n2 % n1;
            }
        }
        if( n1 == 0 ) {
            System.out.println(n1);
        }
        else {
            System.out.println(n2);
        }
    }
}
