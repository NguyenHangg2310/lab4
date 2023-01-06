package Lab4;

import java.util.Scanner;

public class PerfectPrimeFactorList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the upper bound: ");
        int aPosInt = sc.nextInt();
        System.out.println("These numbers are equal to the product of prime factors: ");
        printPerfectPrimeFactorList(aPosInt);
    }

    public static boolean isPrime(int n) {
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
        for (int i = 2; i <= aPosInt / 2; i++) {
            if (isPrime(i) && aPosInt % i == 0) {
                product *= i;
            }
        }
        if (aPosInt == product) {
            return true;
        }
        return false;
    }

    public static void printPerfectPrimeFactorList(int aPosInt) {
        int count = 0;
        for (int i = 2; i <= aPosInt; i++) {
            if (isProductOfPrimeFactors(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        double avg = (double) count / aPosInt * 100;
        System.out.println();
        System.out.printf("[%d numbers found (%.2f%c)] ", count, avg, '%');
    }
}
