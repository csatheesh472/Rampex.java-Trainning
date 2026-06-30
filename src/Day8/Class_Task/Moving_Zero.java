package Day8.Class_Task;

import java.util.Arrays;

class Moving_Zero {
    public static void main(String[] args) {

        int [] nums = {2,0,3,0,5};

        int [] arr = new int[nums.length];

        int pos = 0;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {

                arr[pos] = nums[i];
                pos = pos+1;

            }
            System.out.println(Arrays.toString(arr));
        }

    }
}
