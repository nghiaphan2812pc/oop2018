package week2.task1;

public class Task1 {

    public static int gcd(int a, int b) {
        // TODO: Tính ước chung lớn nhất của 2 số a, b

        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static int fibonacci(int n) {
        int a0 = 0;
        int a1 = 1;
        int an = 1;

        if (n == 0 || n == 1) {
            return n;
        } else {
            for (int i = 2; i < n; i++)
            {
                a0 = a1;
                a1 = an;
                an = a0 + a1;
            }
        }
        return an;

    }
}
