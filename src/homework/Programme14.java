package homework;

import java.util.Scanner;

public class Programme14 {

    static double width;
    static double height;

    public static void main(String[] args) {
        area();
        perimeter();
    }

    public static void area() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the width of the rectangle: ");
        width = input.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        height = input.nextDouble();
        System.out.println("Area is " + width + " * " + height + " = " + width * height);
    }

    public static void perimeter() {
        System.out.println("Perimeter is 2 * (" + width + " + " + height + ")" + " = " + (2 * (width + height)));
    }
}
