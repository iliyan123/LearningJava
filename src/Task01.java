import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Въведете А: ");
        double a = sc.nextDouble();

        System.out.println("Въведете В: ");
        double b = sc.nextDouble();

        System.out.println("Въведете С: ");
        double c = sc.nextDouble();

        if (a > b) {

            double d = a;
            a = b;
            b = d;
        }

        if (a < c && c < b) {

            System.out.println("Числото " + c + " е между " + a + " и " + b);
        }else {
            System.out.println("Числото " + c + " не е между " + a + " и " + b);
        }
    }
}
