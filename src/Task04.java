import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Въведете А: ");
        int a = sc.nextInt();

        System.out.print("Въведете Б: ");
        int b = sc.nextInt();

        if (a < b){
            System.out.println(a + ", " + b);
        }else {
            System.out.println(b + ", " + a);
        }
    }
}
