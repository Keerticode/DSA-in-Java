import java.util.*;
public class DEchars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            for(char ch = (char)('E' - i); ch < 'E'; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}