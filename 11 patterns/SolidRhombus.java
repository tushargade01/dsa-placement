//Solid Rhombus Pattern
/*

             *  *  *  *  * 
          *  *  *  *  *    
       *  *  *  *  *       
    *  *  *  *  *
 *  *  *  *  *


 */

public class SolidRhombus {
    
    static void solidRohmbus(int n) {
        for(int i=1;i<=n;i++) {
            
            //space
            for(int j=1; j<=n-i;j++) {
                System.out.print("   ");
            }

            //stars
            for(int j=1;j<=n;j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
       solidRohmbus(5); 
    }  
}
