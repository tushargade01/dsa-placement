import java.util.HashSet;
import java.util.Set;

public class MinIndexChar {
    
    static int useIndexMethod(String s1, String s2) {
        int minIndex = Integer.MAX_VALUE;
        for(int i=0;i<s2.length();i++) {
            int index = s1.indexOf(s2.charAt(i));

            if(index != -1 && index < minIndex) {
                minIndex = index;
            }
        }
        return (minIndex == Integer.MAX_VALUE) ? -1: minIndex;
    }

    static int useHashSet(String s1, String s2) {
        Set<Character> set = new HashSet<>();
        
        for(char c : s2.toCharArray()) {
            set.add(c);
        }

        for(int i =0; i<s1.length();i++) {
            if(set.contains(s1.charAt(i))) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String s1 = "geeksforgeeks";
        String s2 = "set";    
        System.out.println(useHashSet(s1, s2));
        System.out.println(useIndexMethod(s1, s2));
    }
}
