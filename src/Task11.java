import java.util.Scanner;

public class Task11 {
    /*
        Задача 11:
    Съставете програма, която по дадено трицифренo число проверява
    дали числото се дели на всяка своя цифра. Във въведеното число да
    няма цифра 0.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int first  = num / 100;
        int second = (num / 10) % 10;
        int third = num % 10;

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);

        if (num % first ==0 && num % second == 0 && num % third ==0){

            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
        }
    }