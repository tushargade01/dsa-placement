class HollowReactangle {

    /*
    
 *  *  *  *  * 
 *           *
 *           *
 *  *  *  *  *
 
     */
    static void hollowReactangle(int r, int c) {
        for(int i=1;i<=r;i++) {
            for(int j=1; j<=c; j++) {
                if(i==1 || j==1 || i==r || j==c) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hollowReactangle(4, 5);
    }
}