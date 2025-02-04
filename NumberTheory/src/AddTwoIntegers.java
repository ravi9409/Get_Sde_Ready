public class AddTwoIntegers {
    public static void main(String[] args) {
        System.out.println(sum(17, 9));
    }

    public static int sum(int num1, int num2) {
        while (num2 != 0) {
            int carry = num1 & num2;
            num1 = num1 ^ num2;
            num2 = carry << 1;
        }
        return num1;

    }
}
