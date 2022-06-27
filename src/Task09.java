import java.util.Scanner;

public class Task09 {
    /*
        Задача 9:
        Да се състави програма, която чете от конзолата 2 естествени
        двуцифрени числа a,b.
        Програмата да изведе в конзолата дали последната цифра от
        произведението на двете числа е четна, както и самата цифра.
        Входни данни: a,b - естествени числа от интервала [10..99].
        Пример: 15, 25
        Изход: 375, 5 нечетна
         */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int firstNumber = 0;
        int secondNumber = 0;

        do {
            System.out.print("Моля, въведете двуцифрено число за А: ");
            firstNumber = sc.nextInt();
        }while (10 > firstNumber || firstNumber > 99);

        do {
            System.out.print("Моля, въведете двуцифрено число за Б: ");
            secondNumber = sc.nextInt();
        }while (10 > secondNumber && secondNumber > 99);

        int result = (firstNumber * secondNumber)%10;

        if (result % 2 == 0 ){

            System.out.println(firstNumber * secondNumber + ", " + result + " четно");
        }else {

            System.out.println(firstNumber * secondNumber + ", " + result + " нечетно");
        }
    }
}
