/*
 

          * 
       *  *  *
    *  *  *  *  *
 *  *  *  *  *  *  *
 *  *  *  *  *  *  *
    *  *  *  *  *
       *  *  *
          *


 */

public class Diamond {
    
    static void diamondPattern(int n) {
        for(int i=1;i<=n;i++) {
            //space
            for(int j=1;j<=n-i;j++) {
                System.out.print("   ");
            }

            //stars
            for(int j=1;j<=((2*i)-1);j++) {
                System.out.print(" * ");
            }

            System.out.println();
        }

        //for mirror side
        for(int i=n;i>=1;i--) {
            //space
            for(int j=1;j<=n-i;j++) {
                System.out.print("   ");
            }

            //stars
            for(int j=1;j<=((2*i)-1);j++) {
                System.out.print(" * ");
            }

            System.out.println();
        }
    }
    public static void main(String[] args) {
        diamondPattern(4);
    }    
}
