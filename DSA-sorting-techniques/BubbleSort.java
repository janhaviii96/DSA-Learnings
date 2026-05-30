public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int size = arr.length;
        boolean swapped;

        // Outer loop for passes
        for (int i = 0; i < size - 1; i++) {
            swapped = false;

            // Inner loop for comparisons
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no swaps happened that means array is already sorted
            if (!swapped) break;
        }
    }


    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original array:");
        printArray(arr);
        bubbleSort(arr);
        System.out.println("Sorted array:");
        printArray(arr);
    }
}
/*
 Best Case is O(n) which occurs when the array is already sorted (only one pass).
 Worst Case is O(n^2) which occurs when the array is in reverse order (maximum passes and swaps).
 Average Case is O(n^2)  for random arrays.
*/

