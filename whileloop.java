import java.util.*;

public class whileloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of d: ");
        int d = sc.nextInt();

        int count = 0;
        int sum = 0;

    
        if (d == 0) {
            d = 10;
        }

        while (count < 50) {
            sum = sum + d;  
            d = d + 10;      
            count++;         
        }

        System.out.println("Sum = " + sum);
    }
}