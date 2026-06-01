public class GCD {
    // Recursive Euclidean algorithm
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        int a = 48, b = 18;
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd(a, b));
    }
}

/*
Complexity:
Time: O(log(min(a, b))) -> efficient due to repeated modulus.
Space: O(log(min(a, b))) -> recursion depth.
*/
