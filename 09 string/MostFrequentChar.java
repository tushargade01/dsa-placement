/*
Input: s = "output"
Output: 't'
Explanation:  t and u are the characters with the same frequency, but t is lexicographically smaller.
 */
public class MostFrequentChar {

    static char mostFrequentChar(String str) {
        int[] freq = new int[26];
        int maxFreq = 0;
        char result = 'z';

        for(char c : str.toCharArray()) {
            int index = c - 'a';
            freq[index]++;

            if(freq[index]>maxFreq) {
                maxFreq = freq[index];
                result = c;
            } else if (freq[index] == maxFreq && c<result) {
                result = c;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String str = "output";
        System.out.println(mostFrequentChar(str));
    }
}
