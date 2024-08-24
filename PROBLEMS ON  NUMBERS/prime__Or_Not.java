public class prime__Or_Not {
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        if(n==2){
            return true;
        }
         if(n % 2==0){
            return false;
        }
        // for(int i = 3; i < n; i += 2) { // increment by 2 to check only odd numbers
        //     if (n % i == 0) {
        //         return false; // N is divisible by i, so it's not prime
        //     }
        // }
        return true;
            

    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(isPrime(n));

    }
    
}
