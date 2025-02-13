import java.util.Arrays;
import java.util.HashMap;

public class IntersectionOfTwoArray {
    public static void main(String[] args) {
        int[] a = {2,8,5,4};
        System.out.println(minSwaps(a));
    }

    public static int minSwaps(int[] nums) {
        int c=0;
        for (int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1])
                c++;
        }
        return c;
    }
}