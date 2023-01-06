package Lab4;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(gcd(15,5));
        System.out.println(gcd(99,88));
        System.out.println(gcd(3456,1233));
    }
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

}
