/*


**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********



 */

public class Mid {
    public static void mid(int n){
        for(int i=1;i<=n;i++){
            //stars
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }

            //space
            for(int j=1; j<=(i-1)*2;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=5;i>=1;i--){
            //stars
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }

            //space
            for(int j=1; j<=(i-1)*2;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        mid(5);
    }
}
