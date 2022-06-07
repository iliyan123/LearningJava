import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Въведете А: ");
        int a = sc.nextInt();

        System.out.print("Въведете Б: ");
        int b = sc.nextInt();

        int c = a;
        a = b;
        b = c;

        System.out.println("A = " + a);
        System.out.println("Б = " + b);
    }
}
