package homework;

import java.util.Scanner;

public class Programme6 {

    public static void main(String args[]) {
        area();
    }

    public static void area() {

    Scanner in = new Scanner(System.in);

    System.out.print("Enter the radius:");
    double r = in.nextDouble();
    double area = (22 * r * r) / 7;
    System.out.println("Area of Circle is: " + area);
    }

}