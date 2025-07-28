/*
A = AXY 
B = YADXCP
Output: False
Explanation: A is not a subsequence of B
as 'Y' appears before 'A'. 
 */

public class SubSequenceOther {
    static boolean isSubSequence(String s1, String s2){
        if(s1.length() > s2.length()) {
            return false;
        }
        int i=0,j=0;
        while(i<s1.length() && j<s2.length()) {
            if(s1.charAt(i) == s2.charAt(j)) {
                i++;
            }
            j++;
        }

        return i==s1.length();
    }
    public static void main(String[] args) {
        //String A = "AXY"; 
        //String B = "YADXCP";
        String A = "gksrek";
        String B = "geeksforgeeks";
        System.out.println(isSubSequence(A, B));//output : true
    }
}
