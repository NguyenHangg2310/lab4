package Lab4;

public class NumberSequence {
    public static void main(String[] args) {
        System.out.println("length is " + len(12).length());
    }

    public static String numOfDigits(int n) {
        return n + "";
    }

    public static String len(int n) {
        if (n == 1) {
            return "1";
        } else {
            return len(n - 1) + numOfDigits(n);
        }
    }
}
