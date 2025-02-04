public class SortedAndRotated {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        System.out.println(sortedAndRotated(a));
    }

    public static boolean sortedAndRotated(int[] nums) {
        boolean flag = false;
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1] || nums[i]+1 == nums[i+1]) {
                    count++;
                    if (count == 1)
                        flag = true;
            }else{
                flag=false;
            }
        }
        return flag;
    }
}