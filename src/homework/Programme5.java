package homework;

//programme for calculator with parameters and concatenation

import java.util.Scanner;

public class Programme5 {
    public static void main(String[] args) {
        Programme5 obj = new Programme5();
        Programme5 obj1 = new Programme5();
        // Scanner input = new Scanner(System.in);
//        System.out.println("Select arithmetic operator: + or - or * or / ");
//        String Addition = input.nextLine();

        obj.addition();

        obj1.subtraction();

        multiplication();

        divide();

    }

    public void addition() {

        System.out.println("Addition");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter First Value: ");

        int c = in.nextInt();

        System.out.print("Enter Second Value: ");
        int d = in.nextInt();

        System.out.println("Result : " + (c + d));

    }

    public void subtraction() {

        System.out.println("Subtraction");

        Scanner in = new Scanner(System.in);
        System.out.print("Enter First Value: ");

        int c = in.nextInt();
        System.out.print("Enter Second Value: ");
        int d = in.nextInt();

        System.out.println("Result : " + (c - d));

    }

    public static void multiplication() {

        System.out.println("Multiplication");

        Scanner in = new Scanner(System.in);
        System.out.print("Enter First Value: ");

        int c = in.nextInt();
        System.out.print("Enter Second Value: ");
        int d = in.nextInt();

        System.out.println("Result : " + (c * d));


    }

    public static void divide() {

        System.out.println("Division");

        Scanner in = new Scanner(System.in);
        System.out.print("Enter First Value: ");

        int c = in.nextInt();
        System.out.print("Enter Second Value: ");
        int d = in.nextInt();

        System.out.println("Result : " + (c / d));


    }


}
