package Day8.Class_Task;
import java.util.Scanner;
class Strings {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name:");

        String name = sc.nextLine();

        int n = name.length();

        for(int i = n-1; i >= 0;i--) {

            System.out.println(name.charAt(i));
        }
    }
}
