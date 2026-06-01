public class ReverseString {
    public static String reverse(String str) {
        if (str.isEmpty()) return str;
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String eg = "madman";
        System.out.println("Reversed: " + reverse(eg));
    }
}
/*
Complexity:
Time: O(n^2) , substring creation at each step.
Space: O(n) , recursion depth.
*/
