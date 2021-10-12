package homework;

import java.util.Scanner;
public class Programme19 {

    public static void main(String[] args) {

        convert();
    }
    public static void convert(){

        Scanner input = new Scanner(System.in);
        System.out.println("Write sentence in UPPERCASE:");
        String a = input.nextLine();
        System.out.println("Output: " + a.toLowerCase());

    }
}
