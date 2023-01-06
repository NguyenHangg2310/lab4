package Lab4;

public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println(isPrime(6));
        System.out.println(isPrime(7));
        System.out.println(isPrime(11));
    }
    public static boolean isPrime (int n) {
        if (n < 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
