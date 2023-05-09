package learningRecursion;

public class Fibonacci  {
    private static long[] fibonacciCache;
    public  static  void main(String[] args) {
        int n = 5;//nth no in the fibonacci sequence
        fibonacciCache = new long[n + 1];
        for (int i = 0; i <= n; i++)    {
            System.out.print(fibonacci(i) + " ");
        }

    }
    public static  long fibonacci(int n)  {
        if (n <= 1 && n >= 0)  {
            return n;
        }
        if (fibonacciCache[n] != 0) {
            return fibonacciCache[n];
        }

        long nthFibonacciNumber = (fibonacci(n - 1) + fibonacci(n - 2));
        fibonacciCache[n] = nthFibonacciNumber;

    return  nthFibonacciNumber;

    }
    /* 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89
    *f(n) = f(n - 1) + f(n - 2);
     */

}
