import java.util.*;

class MeanAndMedian {
    public static int[] findMeanAndMedian(int[] arr) {
        int n = arr.length;

        // Step 1: Calculate Mean (average)
        int sum = 0;
        for (int num : arr) sum += num;
        int mean = sum / n; // floor division

        // Step 2: Calculate Median
        Arrays.sort(arr); // sort the array
        int median;
        if (n % 2 == 1) {
            median = arr[n / 2];
        } else {
            median = (arr[n / 2] + arr[(n - 1) / 2]) / 2; // floor average
        }

        return new int[]{mean, median};
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 19, 28, 5};
        System.out.println(Arrays.toString(findMeanAndMedian(arr1))); // Output: [11, 5]

        int[] arr2 = {10, 20, 30, 40};
        System.out.println(Arrays.toString(findMeanAndMedian(arr2))); // Output: [25, 25]

        int[] arr3 = {5};
        System.out.println(Arrays.toString(findMeanAndMedian(arr3))); // Output: [5, 5]
    }
}
