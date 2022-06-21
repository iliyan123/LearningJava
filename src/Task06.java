import java.net.StandardSocketOptions;
import java.util.Scanner;
/*
Задача 6:
Въведете 3 числа от клавиатурата а1, а2 и а3. Разменете стойностите
им така, че а1 да има стойността на а2, а2 да има стойността на а3, а
а3 да има старата стойност на а1.
 */
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