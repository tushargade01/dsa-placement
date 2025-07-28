class BinaryString
{
    //Function to count the number of substrings that start and end with 1.
    public static int binarySubstring(int a, String str)
    {
         int c=0;
         for(int i=0;i<str.length();++i)
         {
             //counting number of 1's in the string.
             if(str.charAt(i)=='1')
             ++c;
         }
         //returning count of possible pairs among total number of 1's.
         return (c*(c-1))/2;
    }

    public static void main(String[] args) {
        System.out.println(binarySubstring(4, "1111"));
    }
}