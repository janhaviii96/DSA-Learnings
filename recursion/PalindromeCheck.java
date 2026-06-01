public class PalindromeCheck {
    public static boolean isPalindrome(String str, int start, int end) {
        if (start >= end) return true;
        if (str.charAt(start) != str.charAt(end)) return false;
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String input = "madam";
        System.out.println("Is palindrome? " + isPalindrome(input, 0, input.length() - 1));
    }
}

/*
Complexity:
Time: O(n) , each character compared once.
Space: O(n) , recursion depth.
*/
