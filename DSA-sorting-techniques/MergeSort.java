public class MergeSort {
    /*  remember this method as you are splitting the array until you can't no more and then
     stitch back together in order. */
    public static void mergeSort(int arr[], int start, int end) {
        if (start < end) {
            int mid = start + (end - start) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

    public static void merge(int arr[], int start, int mid, int end) {
        int n1 = mid - start + 1; //size of left half
        int n2 = end - mid; //size of right half
        int[] L = new int[n1];
        int[] R = new int[n2]; //temp arrays to hold n1,n2

        for (int i = 0; i < n1; i++) //copying elements from org array into L and R
            L[i] = arr[start + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = start;
        while (i < n1 && j < n2) {    //here we compare elements of L & R ,
            if (L[i] <= R[j]) {    //whichever is smaller goes back into the main array (arr[k]).

                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        } //filling until one side runs out

        while (i < n1) {   //If any element is left in L or R,
            arr[k] = L[i];  //copy it back into the main array
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Original array:");
        printArray(arr);
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("Sorted array:");
        printArray(arr);
    }

}
// Overall Time Complexity: O(n log n)
// Merge Sort divides the array into halves recursively (log n levels)
// at each level, merging takes O(n) time i.e. total O(n log n).

/* Best Case is O(n log n) , even if the array is already sorted,
 it still splits and merges.
 Worst Case is O(n log n), regardless of input order, it always performs the same no. of splits & merges*/

