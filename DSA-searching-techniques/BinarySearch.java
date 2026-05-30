public class BinarySearch {

    public static int binarySearch(int[] arr, int key) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                return mid; // Element found
            } else if (arr[mid] < key) {
                low = mid + 1; // for right half
            } else {
                high = mid - 1; // for left half
            }
        }
        return -1; // Element not found
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14};
        int key = 10;

        int result = binarySearch(arr, key);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}

/*
Best Case: O(1) : Element found at the middle in the first comparison
Average Case: O(log n) : Array is halved each iteration
Worst Case: O(log n) : Element not found after all divisions
Space Complexity: O(1) : Constant extra space
*/
