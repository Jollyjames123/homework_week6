package homework;

import java.util.Scanner;

public class Programme17 {

    public static void main(String[] args) {
    Programme17 obj = new Programme17();
    obj.binary();
    }
        public void binary() {

            Scanner input = new Scanner(System.in);
            System.out.print("Input a Decimal Number: ");
            int decimal = input.nextInt();
            System.out.println("Binary number is: " + Integer.toBinaryString(decimal));
        }

    }
