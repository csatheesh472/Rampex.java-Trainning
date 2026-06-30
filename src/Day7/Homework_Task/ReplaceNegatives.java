package Day7.Homework_Task;

class ReplaceNegatives {
    public static void main(String[] args) {
        int[] arr = {5, -3, 12, -7, 0, 9};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = 0;
            }
        }

        System.out.print("Modified array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

