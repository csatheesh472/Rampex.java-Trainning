package Day7.Class_Task;

import java.util.Arrays;

class Find_Max {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 5, 4};

        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        System.out.println("Array: " + Arrays.toString(nums));
        System.out.println("Maximum value: " + max);
    }
}
