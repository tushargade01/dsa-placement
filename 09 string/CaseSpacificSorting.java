/*
    Original String: GEekS
    Sorted String: EeGkS


    input : "defRTSersUXI"
Output: "deeIRSfrsTUX"
 */
public class CaseSpacificSorting {

    static String caseSort(String str) {
        int n = str.length();

        int[] lower = new int[26];
        int[] upper = new int[26];

        for(char ch : str.toCharArray()) {
            if(Character.isLowerCase(ch)) {
                lower[ch-'a']++;
            } else {
                upper[ch - 'A']++;
            }
        }

        StringBuilder result = new StringBuilder(str);
        int l=0,u=0;

        for(int i=0; i<n; i++) {
            char originalChar = str.charAt(i);

            if(Character.isLowerCase(originalChar)) {
                while(lower[l]==0){
                    l++;
                }

                result.setCharAt(i,(char) ('a'+l));
                lower[l]--;
            } else {
                while(upper[u]==0) {
                    u++;
                }
                result.setCharAt(i,(char)('A'+u));
                upper[u]--;
            }
        }

        return result.toString();

    }
    public static void main(String[] args) {
        String str = "defRTSersUXI";
        System.out.println(caseSort(str));
    }
}
