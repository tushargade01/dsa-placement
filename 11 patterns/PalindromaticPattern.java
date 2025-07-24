/*

    1
   212
  32123
 4321234
543212345


 */

public class PalindromaticPattern {
    
    static void palindromaticPattern(int n) {
        for(int i=1; i<=n; i++) {
            //space
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            //left side number
            for(int j=i; j>=1; j--) {
                System.out.print(j);
            }

            //right side numberes
            for(int j=2; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        palindromaticPattern(5);
    }
}
