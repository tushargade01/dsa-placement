public class PrimeNumber {
    static boolean isPrime(int n) {
        if(n==1 || n==2) return true;
        for(int i=2;i<=n/2; i++) {
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(7));
    }    
}
