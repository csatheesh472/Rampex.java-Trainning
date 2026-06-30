package Day8.Class_Task;

import java.util.Arrays;
public class Replace {
    public static void main(String[] args) {

        int [] nums = {1,2,3,4};

        System.out.println(Arrays.toString(nums));

        int temp = 0;
        int n = nums.length;

        for (int i = 0; i < nums.length/2; i++) {

            temp = nums[i];
            nums[i] = nums[n-1-i];
            nums[n-1-i] = temp;

            System.out.println(Arrays.toString(nums));
        }

    }
}
