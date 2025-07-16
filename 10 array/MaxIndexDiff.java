public class MaxIndexDiff {

    public static int maxIndexDiff(int[] arr) {
        int n = arr.length;

        // Step 1: Create LMin[] and RMax[] arrays
        int[] LMin = new int[n];
        int[] RMax = new int[n];

        LMin[0] = arr[0];
        for (int i = 1; i < n; i++) {
            LMin[i] = Math.min(arr[i], LMin[i - 1]);
        }

        RMax[n - 1] = arr[n - 1];
        for (int j = n - 2; j >= 0; j--) {
            RMax[j] = Math.max(arr[j], RMax[j + 1]);
        }

        // Step 2: Traverse LMin[] and RMax[] using two pointers
        int i = 0, j = 0, maxDiff = 0;
        while (i < n && j < n) {
            if (LMin[i] < RMax[j]) {
                maxDiff = Math.max(maxDiff, j - i);
                j++;
            } else {
                i++;
            }
        }

        return maxDiff;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 10};
        System.out.println(maxIndexDiff(arr1)); // Output: 1

        int[] arr2 = {5, 4, 3};
        System.out.println(maxIndexDiff(arr2)); // Output: 0

        int[] arr3 = {1, 2, 3, 4, 5};
        System.out.println(maxIndexDiff(arr3)); // Output: 4
    }
}
