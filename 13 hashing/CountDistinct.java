import java.util.*;
public class CountDistinct {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        HashSet<Integer> set = new HashSet<>();
        
        for (int num : arr) {
            set.add(num);
        }
        
        System.out.println("Count of distinct elements: " + set.size());
    }
}
