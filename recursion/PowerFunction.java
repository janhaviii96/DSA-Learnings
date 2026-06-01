//  power using recursion
public class PowerFunction {
    static int power(int x, int n) {
        // Base case
        if (n == 0) return 1;
        // Recursive case
        return x * power(x, n - 1);
    }

    // Optimized version using divide and conquer
    static int fastPower(int x, int n) {
        if (n == 0) return 1;
        int half = fastPower(x, n / 2);
        if (n % 2 == 0) return half * half;
        else return x * half * half;
    }

    public static void main(String[] args) {
        int x = 2, n = 10;
        System.out.println(x + "^" + n + " = " + power(x, n));
        System.out.println("Optimized " + x + "^" + n + " = " + fastPower(x, n));
    }
}

/*
Naive Recursion:
Time: O(n)
Space: O(n)

Optimized (Divide & Conquer):
Time: O(log n)
Space: O(log n)
*/
