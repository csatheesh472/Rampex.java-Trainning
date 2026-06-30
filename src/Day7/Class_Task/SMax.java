package Day7.Class_Task;

class SMax {
    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 5, 5, 5, 4, 4, 3};

        int max = arr[0];
        int sMax = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > sMax && arr[i] < max) {
                sMax = arr[i];
            }
        }

        System.out.println("Max" + "" + "" +                                                                                                                          " = " + max);
        System.out.println("SMax = " + sMax);

    }

}
