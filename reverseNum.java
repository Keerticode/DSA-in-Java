import java.util.Scanner;

public class reverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        int reverseNum = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            reverseNum = reverseNum * 10 + lastDigit;
            n = n / 10;
        }
        System.out.println("The reversed number is : " + reverseNum);
    }
}
