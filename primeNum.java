//checking whether the given number is prime or not
/* 
import java.util.Scanner;
public class primeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("The given number is a prime number");
        } else {
            System.out.println("The given number is not prime number");
        }
    }
}
*/

//with less Time complexity

import java.util.Scanner;
public class primeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                count++;
            }
            if( n/i != i) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("The given number is a prime number");
        } else {
            System.out.println("The given number is not prime number");
        }
    }
}
