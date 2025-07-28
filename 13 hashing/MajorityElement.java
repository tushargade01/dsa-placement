//given an integer array of size n, find all elements that appear more than [n/3] times.
// nums[] = {1,3,2,5,1,3,1,5,1}o/p = 9/3 = 3
//nums[] = {1,2} o/p = 2/3 = 0.61 = 0

import java.util.*;
public class MajorityElement {
    static void majorityElement(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++) {

            // if(map.containsKey(arr[i])){
            //     map.put(arr[i], map.get(arr[i])+1);
            // } else {
            //     map.put(arr[i],1);
            // }

            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }

        for(Integer key : map.keySet()) {
            if(map.get(key) > arr.length/3) {
                System.out.println(key);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2};
        majorityElement(arr);
    }
}
