import java.util.Scanner;

public class numbersSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                int layer = Math.min(Math.min(i, j), Math.min(n - 1 - i, n - 1 - j));

                System.out.print(n - layer - 1);
            }
            System.out.println();
        }
    }
}


/*
import java.util.Scanner;
public class numbersSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    System.out.print("4");
                }
                else if(i == 1 || j == 1 || i == n - 2 || j == n - 2) {
                    System.out.print("3");
                }
                else if(i == 2 || j == 2 || i == n - 3 || j == n - 3) {
                    System.out.print("2");
                }
                else if(i == 3 || j == 3 || i == n - 4 || j == n - 4) {
                    System.out.print("1");
                }
                else if(i == 4 || j == 4 || i == n - 5 || j == n - 5) {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
*/