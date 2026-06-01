// To generate all permutations of a string using recursion
public class Permutations {
    static void permute(String str, String result) {
        if (str.length() == 0) {
            System.out.println(result);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String remaining = str.substring(0, i) + str.substring(i + 1);
            permute(remaining, result + ch);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        System.out.println("Permutations of " + str + ":");
        permute(str, "");
    }
}

/*
Complexity:
Time: O(n!) (number of permutations)
Space: O(n) recursion stack
*/
