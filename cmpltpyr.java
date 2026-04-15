import java.util.Scanner;

public class cmpltpyr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        for(int i = 0; i<n; i++) {
            //space
            for(int j = 0; j < n-i-1; j++ ){
                System.out.print(" ");
            }

            //star
            for(int j = 0; j < 2*i+1; j++){
                  System.out.print("*");
            }

            //space
            for(int j = 0; j < n-i-1; j++ ){
                System.out.print(" ");
            }
            System.out.println();
        }   
        for(int i = n; i>0; i--){
           //space
            for(int j = 0; j < n-i; j++ ){
                System.out.print(" ");
            }

            //star
            for(int j = 0; j < 2*i-1; j++){
                  System.out.print("*");
            }

            //space
            for(int j = 0; j < n-i; j++ ){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
