package homework;

import java.util.Scanner;

public class Programme13 {
    public static void main(String[] args) {
        average();
    }

    public static void average() {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number= ");
        float one = input.nextFloat();
        System.out.print("Enter second number= ");
        float two = input.nextFloat();
        System.out.print("Enter third number= ");
        float three = input.nextFloat();
        System.out.println("Average of the entered numbers is: " + (one + two + three) / 3);
    }
}
