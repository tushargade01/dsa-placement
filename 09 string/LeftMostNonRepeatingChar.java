public class LeftMostNonRepeatingChar {
    static final int SIZE = 256;
    static int NonRepeating(String str) {
        int [] count = new int[SIZE];
        
        for(int i =0; i<str.length()-1; i++) {
            count[str.charAt(i)]++;
        }

        for(int i=0; i<str.length()-1;i++) {
            if(count[str.charAt(i)] == 1) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String str = "tushatr";
        System.out.println(NonRepeating(str));
    }
}
