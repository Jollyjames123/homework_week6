package homework;

import java.util.Scanner;

public class Programme9 {

    public static void lowerCase() {

        Scanner input = new Scanner(System.in);
        System.out.println("Write in UPPERCASE");
        String upper = input.nextLine();
        System.out.println("Converted in lowercase: " + upper.toLowerCase());

    }

    public static void main(String[] args) {

        lowerCase();
    }
}

