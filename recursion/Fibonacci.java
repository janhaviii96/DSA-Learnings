
public class Fibonacci {
    static int fib(int n) {
        // Base cases
        if (n == 0) return 0;
        if (n == 1) return 1;
        // Recursive case
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int terms = 10;
        System.out.println("Fibonacci series up to " + terms + " terms:");
        for (int i = 0; i < terms; i++) {
            System.out.print(fib(i) + " ");
        }
    }
}

/*
Complexity:
Time: O(2^n) (due to repeated calculations)
Space: O(n)  (recursion stack depth)
*/
