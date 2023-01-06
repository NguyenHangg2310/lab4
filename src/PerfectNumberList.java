package Lab4;

import java.util.Scanner;

public class PerfectNumberList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the upper bound: ");
        int n = sc.nextInt();
        System.out.println("These numbers are perfect: ");
        printPerfect(n);
        System.out.println("These numbers are neither deficient nor perfect: ");
        printDeficient(n);
    }

    public static boolean isPerfect(int aPosInt) {
        int sum = 0;
        for (int i = 1; i <= aPosInt / 2; i++) {
            if (aPosInt % i == 0) {
                sum += i;
            }
        }
        if (sum == aPosInt) {
            return true;
        }
        return false;
    }

    public static boolean isDeficient(int aPosInt) {
        int sum = 0;
        for (int i = 1; i <= aPosInt / 2; i++) {
            if (aPosInt % i == 0) {
                sum += i;
            }
        }
        if (sum < aPosInt) {
            return true;
        }
        return false;
    }

    public static void printPerfect(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (isPerfect(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        double avg = (double) count / n * 100;
        System.out.printf("[%d perfect numbers found (%.2f%c) ]", count, avg, '%');
    }

    public static void printDeficient(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (isDeficient(i) == false && isPerfect(i) == false) {
                System.out.print(i + " ");
                count++;
            }
        }
        double avg = (double) count / n * 100;
        System.out.printf("[%d perfect numbers found (%.2f%c) ]", count, avg, '%');
    }
}
