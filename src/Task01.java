import java.util.Scanner;
/*Задача 1:
    Да се изведат съобщения към потребителя и да се прочетат 2 числа от
    клавиатурата A и B (може да са с плаваща запетая – double).
    После да се прочете 3-то число C и да се провери дали то е м/у A и B.
    Да се изведе подходящо съобщение за това дали C е между A и B.
    Пример:
    Въведете А:
    13.2
    Въведете В:
    29.5
    Въведете С:
    22.1
    Числото 22.1 е между 13.2 и 29.5
*/
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