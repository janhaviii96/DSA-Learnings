public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int size = arr.length;

        // Outer loop for passes
        for (int i = 0; i < size; i++) {
            int minIndex = i; // Assume current index is the minimum

            // Inner loop finds the smallest element in the unsorted part
            for (int j = i + 1; j < size ; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swapping the found minimum element with the first element of unsorted part
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {44, 25, 8, 22, 10};
        System.out.println("Array before sorting:");
        printArray(arr);
        selectionSort(arr);
        System.out.println("Array after sorting:");
        printArray(arr);
    }
}
/* Best Case is O(n^2) when even if the array is already sorted,
 sort still scans the entire array.
 Worst Case is  O(n^2) when the array is in reverse order.
  Unlike Bubble Sort, Selection Sort does not benefit from early stopping.
*/