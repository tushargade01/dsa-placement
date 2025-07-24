//3. Inverted And Rotated Half Pyramid
/*

          * 
       *  *
    *  *  *
 *  *  *  *

 */
public class InvertedHalfPyramid {
    
    static void invertedhalfPyramid(int n) {
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=n-i;j++) {
                System.out.print("   ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        invertedhalfPyramid(4);
    }
}
