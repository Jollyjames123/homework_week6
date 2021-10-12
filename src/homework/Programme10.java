package homework;

import java.util.Scanner;

public class Programme10 {

    public static void main(String[] args) {

        tables();
    }

    public static void tables() {

        Scanner input = new Scanner(System.in);
        System.out.print("Input a Number: ");
        int numb = input.nextInt();
        System.out.println("Table of " + numb);
        System.out.println(numb + " x 1 = " + (numb));
        System.out.println(numb + " x 2 = " + (numb * 2));
        System.out.println(numb + " x 3 = " + (numb * 3));
        System.out.println(numb + " x 4 = " + (numb * 4));
        System.out.println(numb + " x 5 = " + (numb * 5));
        System.out.println(numb + " x 6 = " + (numb * 6));
        System.out.println(numb + " x 7 = " + (numb * 7));
        System.out.println(numb + " x 8 = " + (numb * 8));
        System.out.println(numb + " x 9 = " + (numb * 9));
        System.out.println(numb + " x 10 = " + (numb * 10));


    }


}
