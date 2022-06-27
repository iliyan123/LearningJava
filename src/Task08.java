import java.util.Scanner;

public class Task08 {

    /*Задача 8:
    Да се състави програма, която чете от конзолата 4-цифренo
    естествено число от интервала [1000.. 9999]. От това число се
    формират 2 нови 2-цифрени числа. Първото число се формира от 1-та
    и 4-та цифра на въведеното число. Второто число се формира от 2-рa -
    3-та цифра на въведеното число. Като резултат да се изведе дали 1-то
    ново число e по-малко <, равно = или по-голямо от 2-то число.

    Пример: 3332 Изход: по-малко (32<33)
    Пример: 1144 Изход: равни (14=14)
    Пример: 9875 Изход: по-голямо (95>87)
    */

    public static void main(String[] args) {

        int input = 0;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Моля въведете число между 1000 и 9999: ");
            input = sc.nextInt();

        }while (1000 > input || input > 9999);

        int firstNumber = (input / 1000)*10 + (input % 10);
        int secondNumber = (input / 10) % 100;

        if (firstNumber < secondNumber){

            System.out.println("по-малко (" + firstNumber + "<" + secondNumber + ")");
        }
        else if (firstNumber == secondNumber){

            System.out.println("равни (" + firstNumber + "=" + secondNumber + ")");
        } else {

            System.out.println("по-голямо (" + firstNumber + ">" + secondNumber + ")");
        }
    }
}
