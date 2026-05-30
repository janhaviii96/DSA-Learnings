
public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {9, 18, 27, 1, 23, 12, 8, 10, 24, 30, 15, 14};
        int target = 24;

        // Linear search
        int foundAt = linearSearch(nums, target);
        if (foundAt != -1) {
            System.out.println("Target element found at index: " + foundAt);
        } else {
            System.out.println("Target element not found in array.");
        }
        // try-catch (max)
        try {
            int maxElement = findMax(nums);
            System.out.println("Maximum element: " + maxElement);
        } catch (IllegalArgumentException e) {
            System.out.println("Cannot find max: " + e.getMessage());
        }

        // try-catch (min)
        try {
            int minElement = findMin(nums);
            System.out.println("Minimum element: " + minElement);
        } catch (IllegalArgumentException e) {
            System.out.println("Cannot find min: " + e.getMessage());
        }
    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }

    static int findMax(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int findMin(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}