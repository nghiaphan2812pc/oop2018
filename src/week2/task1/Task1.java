package week2.task1;

public class Task1 {

    public static int gcd(int a, int b)
    {
        // TODO: Tính ước chung lớn nhất của 2 số a, b

        while (a != b)
        {
            if (a > b)
            {
                a = a - b;
            }
            else
                {
                b = b - a;
                }
        }
        return a;
    }

    public static int fibonacci(int n )
    {
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
    public static void main(String args[])
    {
        //System.out.println(gcd(-100,94));
        //	System.out.println(fibonacci(12));
    }

}
