//sum and product of digits using recursion
public class DigitsRecursion {
    static int sumOfDigits(int n) {
        if (n == 0) return 0;
        return (n % 10) + sumOfDigits(n / 10);
    }

    static int productOfDigits(int n) {
        if (n == 0) return 0; // special case
        if (n < 10) return n; // base case
        return (n % 10) * productOfDigits(n / 10);
    }

    public static void main(String[] args) {
        int num = 1234;
        System.out.println("Sum of digits of " + num + " = " + sumOfDigits(num));
        System.out.println("Product of digits of " + num + " = " + productOfDigits(num));
    }
}

/*
Complexity:
Time: O(d) where d = number of digits
Space: O(d) recursion stack
*/
