// both string contain same frequencey character
public class AnagramCheck {

    static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        int size = 256;

        int count[] = new int[size];

        //this loop handle size problem also if size less 
        for(int i=0; i< s1.length(); i++) {
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }

        for(int i=0;i<size;i++) {
            if(count[i] != 0) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        System.out.println(isAnagram("aabac", "baca"));
    }
}


