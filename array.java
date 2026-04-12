public class array {
    public static void main(String[] args) {
        int[] arr = { 3, 7, 20, 9, 15 };
        int n = arr.length;
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (max > arr[i]) {
               max = arr[i];
            }
        }
        System.out.println(max);
    }
}
