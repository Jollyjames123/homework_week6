package homework;

import java.util.Scanner;

public class Programme7 {

    public static void main(String[] args) {
        temperature();

    }

    public static void temperature() {

        Scanner in = new Scanner(System.in);
        System.out.println("Insert temperature value in degree Fahrenheit: ");
        double farnh = in.nextDouble();
        double cel = (((farnh - 32) * 5) / 9);
        System.out.println("Temperature in degree Celcious: " + cel + "°C");
    }


}
