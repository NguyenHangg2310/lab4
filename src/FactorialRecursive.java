package Lab4;

public class FactorialRecursive {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 1; i <= n; i++) {
            System.out.println(factorial(i));
        }
    }
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }else {
            return n * factorial(n - 1);
        }
    }
}
