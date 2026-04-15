import java.util.*;

public class twoside_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();

        int space = 2 * (n - 1);

        for (int i = 1; i <= n; i++) {

            // left numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // spaces
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            // right numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            // decrease space AFTER row
            space -= 2;

            System.out.println();
        }
    }
}