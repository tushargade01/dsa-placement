public class FirstOccurence {

    public static int findSubstring(String txt, String pat) {
        int n = txt.length();
        int m = pat.length();

        if (m > n) return -1;  // pattern longer than text

        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (txt.charAt(i + j) != pat.charAt(j)) {
                    break;
                }
            }

            // If j reached end, match was found
            if (j == m) {
                return i;  // starting index
            }
        }

        return -1;  // no match
    }

    public static void main(String[] args) {
        String txt = "geeksforgeeks";
        String pat = "eks";

        int idx = findSubstring(txt, pat);

        System.out.println(idx);
        
        //scnd

        int result = txt.indexOf(pat);

        if(result != -1) {
            System.out.println(result);
        } else {
            System.out.println(-1);
        }
    }    
}
