public class VowelsCounter {

    static int vowelsCount(String str) {
        int count=0;

        for(int i=0; i<str.length();i++) {
            char s = Character.toLowerCase(str.charAt(i));
            if(s=='a' || s=='e' || s=='i' || s=='o' || s=='u') {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str = "tushaer"; //output : 3
        System.out.println(vowelsCount(str));
    }
}
