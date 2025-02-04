public class NumberOfCommonFactor {

    public static void main(String[] args) {
        System.out.println(commonFactors(12, 6));
    }

    // Brute Force o(n)
    /*
     * public static int commonFactors(int a, int b) {
     * int count = 0;
     * for (int i = 1; i <= (int) Math.min(a, b); i++) {
     * if (a % i == 0 && b % i == 0)
     * count++;
     * }
     * return count;
     * }
     */

    // Optimized one o(log)
    public static int commonFactors(int a, int b) {
        int gcd = findGCD(a, b);
        int count = 0;

        for (int i = 1; i <= gcd; i++) {
            if (gcd % i == 0) {
                count++;
            }
        }

        return count;
    }

    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}