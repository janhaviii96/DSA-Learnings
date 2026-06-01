public class TowerOfHanoi {

    public static void solve(int n, char source, char auxiliary, char destination) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }
        // Move n-1 disks from src to aux
        solve(n - 1, source, destination, auxiliary);
        // Move the nth disk from src to dest
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        // Move n-1 disks from aux to dest
        solve(n - 1, auxiliary, source, destination);
    }

    public static void main(String[] args) {
        int n = 3; // Number of disks
        solve(n, 'A', 'B', 'C');
    }
}
/*
Complexity:
Time: O(2^n) : exponential growth due to discs recursive moves.
Space: O(n) : recursion stack depth.
*/