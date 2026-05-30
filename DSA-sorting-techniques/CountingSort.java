public class CountingSort {
    static void countingSort(int arr[], int max) {
        int n = arr.length;
        int count[] = new int[max + 1]; // freq array
        int output[] = new int[n];      // o/p array

        // Count occurrences
        for (int i = 0; i < n; i++)
            count[arr[i]]++;

        // Compute prefix sums
        for (int i = 1; i <= max; i++)
            count[i] += count[i - 1];

        // Build output array (stable)
        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }

        // Copy to original array
        for (int i = 0; i < n; i++)
            arr[i] = output[i];
    }

    public static void main(String args[]) {
        int arr[] = {4, 2, 2, 8, 3, 3, 1};
        int max = 8; // maximum element in array
        countingSort(arr, max);
        System.out.println("Counting Sorted array:");
        for (int num : arr) System.out.print(num + " ");
    }
}

/*
Complexity: Time: O(n + k), where k = range of input
Space: O(n + k)
*/
