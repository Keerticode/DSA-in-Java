
import java.util.Scanner;

public class palindromeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of number : ");
        int number = sc.nextInt();
        int storeNum = number;
        int reverseNum = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            reverseNum = reverseNum * 10 + lastDigit;
            number = number / 10;
        }
        if (storeNum == reverseNum) {
            System.out.println("The given numbers are palindrome");
        } else {
            System.out.println("The given numbers are not palindrome");
        }
    }
}
