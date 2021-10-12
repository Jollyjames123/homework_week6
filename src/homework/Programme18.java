package homework;

import java.util.Scanner;

    public class Programme18 {


        public static void main(String[] args) {

            printresult();
        }


        public static void printresult() {

            int number1, number2;

            Scanner input = new Scanner(System.in);
            System.out.print("Input first number: ");
            number1 = input.nextInt();
            System.out.print("Input second number: ");
            number2 = input.nextInt();

            System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
            System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
            System.out.println(number1 + " * " + number2 + " = " + (number1 * number2));
            System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));
            System.out.println(number1 + " mod " + number2 + " = " + (number1 % number2));


        }

    }
