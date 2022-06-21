import java.util.Scanner;
/*
        Задача 3:
    Въведете 2 различни числа от конзолата и разменете стойността им.
    Разпечатайте новите стойности
*/

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