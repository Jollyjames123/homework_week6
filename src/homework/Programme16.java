package homework;

import java.util.Scanner;

public class Programme16 {

    public static void main(String[] args) {

        System.out.println("Sum of two binary numbers: " + addition());
    }

    public static String addition() {
        String binary1, binary2;
        Scanner input = new Scanner(System.in);
        System.out.print("Input first binary number: ");
        binary1 = input.nextLine();
        System.out.print("Input second binary number: ");
        binary2 = input.nextLine();

        int int1 = Integer.parseInt(binary1, 2);
        int int2 = Integer.parseInt(binary2, 2);

        int sum = int1 + int2;
        return Integer.toBinaryString(sum);

    }
}
