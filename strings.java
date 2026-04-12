//Finding the length of strings without using inbuilt function
public class strings {
    public static void main(String[] args) {
        String str = "abcd";
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            System.out.println("count has reached out of bounds");
        }
        System.out.println(count);
    }
}
