public class SingleElementInSorteArray {
    public static void main(String[] args) {
        int[] a = {1, 1, 2, 3, 3, 4, 4, 8, 8};
        System.out.println(singleElement(a));
    }

    public static int singleElement(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            /**
             * This method adjusts the mid index to ensure it is even.
             * If the mid index is odd, it decrements it by 1 to make it even.
             * This is necessary because the algorithm pairs elements to find the single element.
             */
            if (mid % 2 == 1) {
                mid--;
            }
            /**
             * If the element at the mid index is equal to the element at mid + 1,
             * it means the single element is in the right half of the array.
             * Therefore, adjust the low index to mid + 2.
             * Otherwise, the single element is in the left half or at mid,
             * so adjust the high index to mid.
             */
            if (nums[mid] == nums[mid + 1]) {
                low = mid + 2;
            } else {
                high = mid;
            }
        }
        /**
         * Returns the single element found in the array.
         */
        return nums[low];
    }
}