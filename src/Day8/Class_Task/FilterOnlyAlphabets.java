package Day8.Class_Task;

import java.util.Scanner;
public class FilterOnlyAlphabets {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your insta user name :");

        String userName = sc.nextLine();

        for (int i = 0;i < userName.length(); i++) {

            if (userName.charAt(i) >= 'a' && userName.charAt(i) <= 'z' || userName.charAt(i) >= 'A' && userName.charAt(i) <= 'Z') {

                System.out.print(userName.charAt(i));

            }
        }
    }
}
