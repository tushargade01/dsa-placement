public class CountNumber {
    static int countNumber(int n) {
        int res=0;
        while(n>0) {
            n/=10;
            res++;
        }
        return res;
    }

    static boolean isPaylindrome(int n) {
        int temp = n;
        int res=0;
        while(temp>0) {
            int last = temp % 10;

            res = res*10 + last;

            temp /= 10;
        }

        return res == n;
    }

    static int factorial(int n) {
        if(n==1) return 1;
        
        return n * factorial(n-1);
    }

    static int zeroTrailingFact(int n) {
        int res=0;
        for(int i = 5; i<=n; i=i*5) {
            res = res + (n/i);
        }
        return res;
    }
    public static void main(String[] args) {   
        System.out.println(countNumber(127345));
        System.out.println(isPaylindrome(1271));
        System.out.println(factorial(5));
        System.out.println(zeroTrailingFact(15));
    }   
}
