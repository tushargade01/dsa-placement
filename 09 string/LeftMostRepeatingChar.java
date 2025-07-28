//return index of most repeating char at left
class LeftMostRepeatingChar {
    static int mostRepeatingChar(String str) {
        final int SIZE = 256;
        boolean[] visited = new boolean[SIZE];

        int result = -1;

        for(int i=str.length()-1; i>=0; i--) {
            if(visited[str.charAt(i)]) {
                result = i;
            }else {
                visited[str.charAt(i)] = true;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        //String str = "geeksforgeeks";
        String str = "tushargade";
        System.out.println(mostRepeatingChar(str));
    }
}