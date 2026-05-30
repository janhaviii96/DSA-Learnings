public class TernarySearch {
    // Recursive Ternary Search method
    public static int ternarySearch(int[] arr, int left, int right, int key) {
        if (right >= left) {
            // Divide array in three parts
            int mid1 = left + (right - left) / 3;
            int mid2 = right - (right - left) / 3;

            // Check if key is at mid1 or mid2
            if (arr[mid1] == key) return mid1;
            if (arr[mid2] == key) return mid2;

            // If key is in left 1/3
            if (key < arr[mid1]) {
                return ternarySearch(arr, left, mid1 - 1, key);
            }
            // If key is in right 1/3
            else if (key > arr[mid2]) {
                return ternarySearch(arr, mid2 + 1, right, key);
            }
            // If key is in middle 1/3
            else {
                return ternarySearch(arr, mid1 + 1, mid2 - 1, key);
            }
        }
        return -1; // Element not found
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14 , 16,20,28}; //works on sorted array
        int key = 16;

        int result = ternarySearch(arr, 0, arr.length - 1, key);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}

/*
Best Case: O(1) : Element found at mid1 / mid2 in first comparison
Average Case: O(log3 n) : Array is divided into 3 parts each iteration
Worst Case: O(log3 n) : Element not found
Space Complexity: O(log n) : Due to recursion stack
*/
