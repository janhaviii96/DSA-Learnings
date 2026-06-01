public class RecursiveBinarySearch {
    static int binarySearch(int arr[], int low, int high, int key) {
        if (low > high) return -1; // base case: not found

        int mid = (low + high) / 2;

        if (arr[mid] == key) return mid;
        else if (arr[mid] > key) return binarySearch(arr, low, mid - 1, key);
        else return binarySearch(arr, mid + 1, high, key);
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10, 12, 14};
        int key = 10;
        int result = binarySearch(arr, 0, arr.length - 1, key);
        System.out.println(result == -1 ? "Not Found" : "Found at index " + result);
    }
}

/*
Complexity:
Time: O(log n)
Space: O(log n) recursion stack
*/
