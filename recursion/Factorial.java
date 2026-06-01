public class Factorial {
    static int factorial(int n) {
        // Base case
        if (n == 0 || n == 1) return 1;
        // Recursive case
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println("Factorial of " + num + " = " + factorial(num));
    }
}

/*
Complexity:
Time: O(n)  (n  calls)
Space: O(n) (due to recursion stack)
*/
