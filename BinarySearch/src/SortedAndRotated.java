public class SortedAndRotated {
    public static void main(String[] args) {
        int[] a = {4,5,1,2,3};
        System.out.println(sortedAndRotated(a));
    }

    public static boolean sortedAndRotated(int[] nums) {
        int c=0;
        boolean flag=true;
        for (int i=0;i<nums.length;i++){
            if(nums[i]>nums[(i+1)%nums.length]){
                c++;
            }
            if (c>1){
                flag= false;
            }

        }

        return flag;
    }
}