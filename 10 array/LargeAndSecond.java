import java.util.*;

class LargeAndSecond {
    public static ArrayList<Integer> largestAndSecondLargest(int arr[]) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num < max && num > secondMax) {
                secondMax = num;
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        result.add(max);
        result.add(secondMax);
        return result;
    }

    // Main method for testing
    public static void main(String[] args) {
        int[] a1 = {2, 1, 2};
        System.out.println(largestAndSecondLargest(a1));  // Output: [2, 1]

        int[] a2 = {3, 3, 3};
        System.out.println(largestAndSecondLargest(a2));  // Output: [3, -1]

        int[] a3 = {5, 10, 9, 10};
        System.out.println(largestAndSecondLargest(a3));  // Output: [10, 9]
    }
}
