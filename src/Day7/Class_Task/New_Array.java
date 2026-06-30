package Day7.Class_Task;
import java.util.Arrays;
import java.util.Scanner;

class Newarrays_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the value " + (i + 1) + ":");
            arr[i] = sc.nextInt();

            System.out.println(Arrays.toString(arr));
        }

    }
}
