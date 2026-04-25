class Solution {

    public boolean isPalindrome(String s) {
        return check(0, s.length() - 1, s);
    }

    public boolean check(int i, int j, String s) {
        
        while (i < j && !Character.isLetterOrDigit(s.charAt(i))) {
            i++;
        }

        while (i < j && !Character.isLetterOrDigit(s.charAt(j))) {
            j--;
        }

        if (i >= j) return true;

        // Compare (ignore case)
        if (Character.toLowerCase(s.charAt(i)) != 
            Character.toLowerCase(s.charAt(j))) {
            return false;
        }

        return check(i + 1, j - 1, s);
    }
}