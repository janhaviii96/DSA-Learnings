// Java implementation of Radix Sort using Counting Sort as subroutine
public class RadixSort {
    // utility function to get maximum value
    static int getMax(int arr[]) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (arr[i] > max) max = arr[i];
        return max;
    }

    // Counting sort according to digit represented by exp
    static void countingSort(int arr[], int exp) {
        int n = arr.length;
        int output[] = new int[n];
        int count[] = new int[10]; // digits 0-9

        // Count occurrences
        for (int i = 0; i < n; i++)
            count[(arr[i] / exp) % 10]++;

        // Compute prefix sums
        for (int i = 1; i < 10; i++)
            count[i] += count[i - 1];

        // Build output array
        for (int i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        // Copy to original array
        for (int i = 0; i < n; i++)
            arr[i] = output[i];
    }

    static void radixSort(int arr[]) {
        int max = getMax(arr);

        // Apply counting sort for each digit
        for (int exp = 1; max / exp > 0; exp *= 10)
            countingSort(arr, exp);
    }

    public static void main(String args[]) {
        int arr[] = {170, 45, 75, 90, 802, 24, 2, 66};
        radixSort(arr);
        System.out.println("Radix Sorted array:");
        for (int num : arr) System.out.print(num + " ");
    }
}

/*
Complexity: Time: O(nk), where k = number of digits
Space: O(n + k)
*/
