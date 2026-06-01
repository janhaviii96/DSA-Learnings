public class PrintNumbers {
    //  from 1 to N
    public static void printAscending(int n) {
        if (n == 0) return;
        printAscending(n - 1);
        System.out.print(n + " ");
    }

    // from N to 1
    public static void printDescending(int n) {
        if (n == 0) return;
        System.out.print(n + " ");
        printDescending(n - 1);
    }

    public static void main(String[] args) {
        int N = 5;
        System.out.println("Ascending:");
        printAscending(N);
        System.out.println("\nDescending:");
        printDescending(N);
    }
}
/*
Complexity:
Time: O(n) , each number is printed once.
Space: O(n) , recursion stack depth.
*/