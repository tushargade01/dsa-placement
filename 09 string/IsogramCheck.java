//Given a string S of lowercase alphabets, check if it is isogram or not. An Isogram is a string in which no letter occurs more than once.
public class IsogramCheck {
    static boolean isIsogram(String str) {
        final int SIZE = 26;
        int[] temp = new int[SIZE];

        for(char ch : str.toCharArray()) {
            temp[ch-'a']++;
        }
        for(int i=0;i<SIZE;i++){
            if(temp[i] == 2) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "tushar";
        System.out.println(isIsogram(str));
    }
}
