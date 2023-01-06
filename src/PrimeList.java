package Lab4;
import java.util.Scanner;
public class PrimeList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the upper bound: ");
        int n = sc.nextInt();
        printPrimeList(n);
        sc.close();
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

    public static void printPrimeList(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("count " + count);
        double avg = (double)count / n * 100;
        System.out.printf("[ %d primes found (%.2f%c)",count,avg,'%');
    }
}
