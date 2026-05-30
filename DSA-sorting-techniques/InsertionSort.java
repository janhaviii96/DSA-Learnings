public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) { // Loop starts from index 1 (2nd element)
            //because the 1s element is considered sorted.
            int key = arr[i];
            int j = i - 1;


            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];  //This shifts the bigger element one position forward (right).
                j--;
            }
            arr[j + 1] = key;
        }
    }


    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        System.out.println("Original Array:");
        printArray(arr);
        insertionSort(arr);
        System.out.println("Sorted Array:");
        printArray(arr);
    }
        /* Best Case is O(n)(array is already sorted : only one comparison per element).
Average Case is O(n^2) that is about half the elements need shifting.
 Worst Case is O(n^2)  when the array is reversed. */
}
