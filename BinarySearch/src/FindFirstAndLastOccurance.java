public class FindFirstAndLastOccurance {
    public static void main(String[] args) {
        int[] a = new int[] { 5, 7, 7, 8, 8, 7, 10 };
        int target = 7;
        System.out.println(findFirstOccurance(a, target, false));
    }

    public static int findFirstOccurance(int[] arr, int x, boolean findFirst) {
        int low = 0;
        int high = arr.length - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                result = mid;
                if (findFirst)
                    high = mid - 1;
                else
                    low = mid + 1;
            } else if (arr[mid] > x)
                high = mid - 1;
            else if (arr[mid] < x)
                low = mid + 1;
        }
        return result;
    }
}