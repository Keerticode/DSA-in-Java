import java.util.*;
public class char_right {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            for(char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
