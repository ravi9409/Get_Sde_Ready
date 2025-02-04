public class FactorialOfNumber {

    public static void main(String[] args) {
        System.out.println(factorial(25));
    }

    public static int factorial(int N) {
        int result = 1;
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                result = result * i;
            }
        }
        return result;
    }
}