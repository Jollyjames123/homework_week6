package homework;

import java.util.Scanner;

public class Programme8 {

    public static void main(String[] args) {
        Programme8 obj1 = new Programme8();
        obj1.tArea();
    }

    public void tArea() {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the width/base of the Triangle:");
        double width = in.nextDouble();

        System.out.println("Enter the height of the Triangle:");
        double height = in.nextDouble();

        //Area = (width*height)/2
        double area = (width * height) / 2;
        System.out.println("Area of Triangle: " + area);

    }
}


