package homework;

/*
Declare two static variables and one static method
call both variable in the method inside print statement
declare the main method and call the static method inside the main method
 */
public class Programme2 {
    static int a = 5; // static variable
    static int b = 10; // static variable

    public static void method1() { // static method
        System.out.println(a + b);
    }

    public static void main(String[] args) { //main method
        Programme2.method1(); // calling method using class name
    }
}
