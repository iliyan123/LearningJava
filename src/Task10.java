import java.util.Scanner;

public class Task10 {
    /*
            Задача 10:
        Трябва да се напълни цистерна с вода. Имате 2 кофи с вместимост 2 и
        3 литра и ги ползвате едновременно.
        Да се състави програма, която по даден обем извежда как ще прелеете
        течността с тези кофи, т.е. по-колко пъти ще се пълни всяка от
        кофите. Кофите не могат да се ползват с частично количество вода.
        Входни данни: естествено число от интервала [10..9999].
        Пример: 107
        Изход: 21 пъти по 2 литра,
         21 пъти по 3 литра
         допълнително кофа от 2 литра

     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int volume = sc.nextInt();


        int counter = volume / 5;
        int volLeft = volume % 5;

        if (volLeft == 0){

            System.out.println(counter + " пъти по 2 литра");
            System.out.println(counter + " пъти по 3 литра");

        } else if (volLeft == 2){

            System.out.println(counter + " пъти по 2 литра");
            System.out.println(counter + " пъти по 3 литра");
            System.out.println("допълнително кофа от 2 литра");

        }else if (volLeft == 3){

            System.out.println(counter + " пъти по 2 литра");
            System.out.println(counter + " пъти по 3 литра");
            System.out.println("допълнително кофа от 3 литра");

        }else if (volLeft == 4){

            System.out.println(counter + " пъти по 2 литра");
            System.out.println(counter + " пъти по 3 литра");
            System.out.println("допълнително две кофи от по 2 литра");

        }else if (volLeft == 1){

            counter-=1;
            System.out.println(counter + " пъти по 2 литра");
            System.out.println(counter + " пъти по 3 литра");
            System.out.println("допълнително две кофи от по 3 литра");

        }
    }
}
