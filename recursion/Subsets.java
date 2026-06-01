// To generate all subsets (power set) of a string using recursion
public class Subsets {
    static void generateSubsets(String str, String current, int index) {
        if (index == str.length()) {
            System.out.println(current);
            return;
        }
        // Include current character
        generateSubsets(str, current + str.charAt(index), index + 1);
        // Exclude current character
        generateSubsets(str, current, index + 1);
    }

    public static void main(String[] args) {
        String str = "abc";
        System.out.println("Subsets of " + str + ":");
        generateSubsets(str, "", 0);
    }
}

/*
Complexity:
Time: O(2^n) (each character has 2 choices: include/exclude)
Space: O(n) recursion stack
*/
