public class SortedAndRotated {
    
    public static boolean check(int[] arr, int n) {
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > arr[(i + 1) % n]) {
                count++;
            }
        }

        // Array is sorted and rotated if and only if there is exactly one out-of-order point
        return count == 1;
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 4, 5, 1, 2}; // YES
        int[] arr2 = {1, 2, 3, 4, 5}; // NO (sorted but not rotated)
        int[] arr3 = {2, 1, 5, 4, 3}; // NO (not sorted-rotated)
        int[] arr4 = {5, 1, 2, 3, 4}; // YES

        System.out.println(check(arr1, arr1.length) ? "YES" : "NO");
        System.out.println(check(arr2, arr2.length) ? "YES" : "NO");
        System.out.println(check(arr3, arr3.length) ? "YES" : "NO");
        System.out.println(check(arr4, arr4.length) ? "YES" : "NO");
    }
}
