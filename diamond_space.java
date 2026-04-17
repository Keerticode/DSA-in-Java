import java.util.Scanner;

public class diamond_space {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();

        int inspace = 0;
        for (int i = 0; i < n; i++) {

            // stars
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            // spaces
            for (int j = 0; j < inspace; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            inspace += 2;
            System.out.println();
        }

        inspace = 8;
        for (int i = 1; i <= n; i++) {
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Space
            for (int j = 0; j < inspace; j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            inspace -= 2;
            System.out.println();
        }
    }
}