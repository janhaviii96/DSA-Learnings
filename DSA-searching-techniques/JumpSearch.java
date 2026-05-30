public class JumpSearch {

    // Jump Search method
    public static int jumpSearch(int[] arr, int key) {
        int n = arr.length;
        int step = (int)Math.floor(Math.sqrt(n)); // Optimal jump size
        int prev = 0;

        // Jump ahead until we find a block where key could be present
        while (arr[Math.min(step, n) - 1] < key) {
            prev = step;
            step += (int)Math.floor(Math.sqrt(n));
            if (prev >= n) {
                return -1; // Element not found
            }
        }

        // Linear search within the identified block
        while (prev < Math.min(step, n)) {
            if (arr[prev] == key) {
                return prev; // Element found
            }
            prev++;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14};
        int key = 10;

        int result = jumpSearch(arr, key);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
