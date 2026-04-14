public class forloop {
    public static void main(String[] args) {
        int low = 10;
        int high = 16;
        int sum = 0;
        for(int i = low; i < high ; i++){
            sum = sum + i;
        }
        System.out.println("The sum is : " + sum);
    }
}
