import java.util.Scanner;

public class angastromNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        int store = n;
        int sum = 0;
        while(n > 0) {
            int lastDigit = n % 10;
            int cubeNumber = lastDigit*lastDigit*lastDigit;
            sum = sum + cubeNumber;
            n = n / 10;
        }
        if(store == sum) {
            System.out.println("The number is angastrom");
        }
        else {
            System.out.println("The number is not angastrom");
        }
    }
}
