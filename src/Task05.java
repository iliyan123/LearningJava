import java.util.Scanner;
/*
        Задача 5:
    Въведете 3 различни числа от конзолата и ги разпечатайте в низходящ
    ред.
*/
public class Task05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Въведете А: ");
        int a = sc.nextInt();

        System.out.print("Въведете Б: ");
        int b = sc.nextInt();

        System.out.print("Въведете В: ");
        int c = sc.nextInt();

        if (a < b && b < c){
            System.out.println(c + ", " + b + ", " + a);
        }else if (b < a && a < c){
            System.out.println(c + ", " + a + ", " + b);
        }else if (c < a && a < b){
            System.out.println(b + ", " + a + ", " + c);
        }else if (c < b && b < a){
            System.out.println(a + ", " + b + ", " + c);
        }else if (a < c && c < b){
            System.out.println(b + ", " + c + ", " + a);
        }else if (b < c && c < a){
            System.out.println(a + ", " + c + ", " + b);
        }
    }
}
