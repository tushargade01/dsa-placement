public class UniqueLetters {
    static String isUnique(String str) {
        boolean[] CHAR = new boolean[256];
        StringBuilder result = new StringBuilder();

        for(char ch : str.toCharArray()) {
            if(!CHAR[ch]) {
                CHAR[ch] = true;
                result.append(ch);
            }
        }

        return new String(result);


    }
    public static void main(String[] args) {
        String str = "programming";
        System.out.println(isUnique(str));
    }
}
