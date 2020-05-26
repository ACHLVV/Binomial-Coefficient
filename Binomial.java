/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class Binomial {
    public static long factorial(long x) {
        long result = 1;
        for (long count = 1; count <= x; count++) {
            result = result * count;
        }
        return result;
    }

    public static long binomial(long n, long k) {
        long result = (factorial(n)) / (factorial(k) * (factorial(n - k)));
        return result;
    }

    public static void main(String[] args) {
        long n = Long.parseLong(args[0]);
        long k = Long.parseLong(args[1]);
        System.out.println(binomial(n, k));

    }
}
