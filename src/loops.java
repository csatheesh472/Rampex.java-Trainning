import java.net.SocketOption;

public class loops {
    public static void main(String[] args) {
        for (int i =1;i<=5;i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("Exited from the for loop");
    }
}
