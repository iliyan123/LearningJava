import java.net.StandardSocketOptions;
import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Въведете А: ");
        int a1 = sc.nextInt();

        System.out.print("Въведете Б: ");
        int a2 = sc.nextInt();

        System.out.print("Въведете В: ");
        int a3 = sc.nextInt();

        int b = a1;
        int c = a2;

        a1 = a2;
        a2 = a3;
        a3 = b;

        System.out.println(a1 + " " + a2 + " " + a3);
    }
}
