public class ArrayMaxMin {
    static int findMax(int arr[], int n) {
        if (n == 1) return arr[0]; // base case
        return Math.max(arr[n - 1], findMax(arr, n - 1));
    }

    static int findMin(int arr[], int n) {
        if (n == 1) return arr[0]; // base case
        return Math.min(arr[n - 1], findMin(arr, n - 1));
    }

    public static void main(String[] args) {
        int arr[] = {12, 4, 7, 9, 2, 15};
        System.out.println("Max = " + findMax(arr, arr.length));
        System.out.println("Min = " + findMin(arr, arr.length));
    }
}

/*
Complexity:
Time: O(n)
Space: O(n)
*/
