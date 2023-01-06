package Lab4;

public class GCDRecursive {
    public static void main(String[] args) {
        System.out.println(gcd(10,20));
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
           return a;
        }
            return gcd(b,a % b);
    }
}
