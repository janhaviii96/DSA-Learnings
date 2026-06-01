//  to check if array is sorted using recursion
public class CheckSorted {
    static boolean isSorted(int arr[], int n) {
        if (n == 1) return true; // base case
        if (arr[n - 1] < arr[n - 2]) return false;
        return isSorted(arr, n - 1);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println("Array sorted? " + isSorted(arr, arr.length));
    }
}

/*
Complexity:
Time: O(n)
Space: O(n) recursion stack
*/
