import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Въведете А: ");
        int a = sc.nextInt();

        System.out.println("Въведете Б: ");
        int b = sc.nextInt();

        int sum = a + b;
        int subtr = a - b;
        int multiplication = a * b;
        int division = a / b;
        int div = a % b;

        System.out.println("Резултат от събиране: " + sum);
        System.out.println("Резултат от изваждане: " + subtr);
        System.out.println("Резултат от умножение: " + multiplication);
        System.out.println("Резултат от целочислено деление: " + division);
        System.out.println("Резултат от остатък от деление: " + div);

    }
}