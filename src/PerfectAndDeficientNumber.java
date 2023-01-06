package Lab4;

public class PerfectAndDeficientNumber {
    public static void main(String[] args) {
        System.out.println(isPerfect(6));
        System.out.println(isPerfect(7));
        System.out.println(isPerfect(10));
        System.out.println(isDeficient(10));
        System.out.println(isDeficient(12));

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
}
