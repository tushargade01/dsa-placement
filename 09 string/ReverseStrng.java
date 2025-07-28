public class ReverseStrng {
    
    static void  reverse(char[] str, int left, int right) {
        while(left < right) {
            char temp = str[left];
            str[left] = str[right];
            str[right] = temp;
            
            left++;
            right--;
        }
    }

    static String reverseString(String s) {
        int start = 0;

        s = s.trim().replaceAll("\\s+", " ");
        char[] str = s.toCharArray();

        for(int end=0; end <= str.length; end++) {
            if(end==str.length || str[end] == ' ') {
                reverse(str, start, end-1);
                start = end+1;
            }
        }

        reverse(str, 0, str.length-1);

        return new String(str);
    }

    public static void main(String[] args) {
        String str = "my name is  tushar ";
        System.out.println(reverseString(str));
    }
}