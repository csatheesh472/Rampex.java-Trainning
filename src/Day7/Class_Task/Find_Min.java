package Day7.Class_Task;

import java.util.Arrays;

class Find_Min {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 5, 4};

        int min = nums[0]; // initialize with first element

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }

        System.out.println("Array: " + Arrays.toString(nums));
        System.out.println("Maximum value: " + min);
    }
}
