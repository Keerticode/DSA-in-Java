import java.util.*;
public class countDigit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        long n = sc.nextLong();
        int count = 0;
        while(n > 0) {
           long lastdigit = n % 10;
           count++;
           n = n / 10;
        }
        System.out.println("The count of digits in number is : " + count);
    }
}