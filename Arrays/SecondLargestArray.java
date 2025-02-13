package Arrays;

public class SecondLargestArray {
    public static void main(String[] args) {
        int[] a = { 1, 17, 15, 9, 6, 8 };
        System.out.println(secondLargest(a));
    }

    public static int secondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        if (secondLargest != Integer.MIN_VALUE) {
            return secondLargest;
        } else {
            return -1;

        }
    }
}