package Lab4;

public class PrimeFactors {
    public static void main(String[] args) {
        System.out.println(isProductOfPrimeFactors(30));
        System.out.println(isProductOfPrimeFactors(20));
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

    public static boolean isProductOfPrimeFactors(int aPosInt) {
        int product = 1;
        for (int i = 2; i <= aPosInt/2; i++) {
            if (isPrime(i) && aPosInt % i == 0) {
                product *= i;
            }
        }
        if (aPosInt == product) {
            return true;
        }
        return false;
    }
}
