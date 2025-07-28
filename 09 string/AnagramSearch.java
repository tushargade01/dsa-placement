public class AnagramSearch {
    
    static final int CHAR = 256;

    static boolean areSame(int[] CT, int[] CP) {
        for(int i = 0; i < CHAR; i++) {
            if(CT[i] != CP[i]){
                return false;
            }
        }
        return true;
    }

    static boolean isPresnt(String txt, String pat) {
        int[] CT = new int[CHAR];
        int[] CP = new int[CHAR];

        for(int i =0; i< pat.length();i++) {
            CT[txt.charAt(i)]++;
            CP[pat.charAt(i)]++;
        }

        for(int i=pat.length();i<txt.length();i++) {

            if(areSame(CT, CP)) {
                return true;
            }

            CT[txt.charAt(i)]++;
            CT[txt.charAt(i-pat.length())]--;
        }

        return areSame(CT, CP);
    }
    
    public static void main(String[] args) {
        String txt = "tushargade";
        String pat = "gdeaf"; //shoud return false

        System.out.println(isPresnt(txt, pat));
    }
}
