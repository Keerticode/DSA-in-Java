public class functions {
    public static int arrayCreation(int n) {
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = n - 1; i >= 0; i--) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
        return 1;
    }

    public static void main(String[] args) {
        arrayCreation(5);
    }
}
