public class PalindromeCheck {
    
    static boolean isPalindrome(String str) {
        int left = 0, right = str.length()-1;

        while(left<right) {
            if(str.charAt(left) != str.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        //String str = "madam";
        String str1 = "A man a plan a canal Panama";

        String processedString = str1.replaceAll("\\s+","").toLowerCase(); 
        //remove whitespaces, newline

        if(isPalindrome(processedString)){
            System.out.println("str is palindrome.");
        }else {
            System.out.println("str is not palindrome.");
        }
    }
}
