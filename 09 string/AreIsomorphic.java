public class AreIsomorphic {

    static boolean isIsomorphic(String s, String t) {
        
       if (s.length() != t.length()) return false;

        int[] mapS = new int[256];
        int[] mapT = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            if (mapS[ch1] != mapT[ch2]) return false;

            // Use i+1 to avoid conflict with default 0s
            mapS[ch1] = i + 1;
            mapT[ch2] = i + 1;
        }

        return true;
    }
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "xxz";
        System.out.println(isIsomorphic(s1, s2));
    }
}
