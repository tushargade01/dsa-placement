/*

*                          * 
 *  *                    *  *
 *  *  *              *  *  *
 *  *  *  *        *  *  *  *
 *  *  *  *  *  *  *  *  *  *


 */

public class ButterflyPattern {
    static void butterflyPattern(int n) {
        for(int i=1;i<=n;i++) {
            
            //stars
            for(int j=1;j<=i;j++) {
                System.out.print(" * ");
            }
            
            //space
            for(int j=1;j<=(n-i)*2;j++) {
                System.out.print("   ");
            }

            //stars
            for(int j=1;j<=i;j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        butterflyPattern(5);
    }
}
