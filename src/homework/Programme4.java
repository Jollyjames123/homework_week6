package homework;

/*
Declare two instance and two static variables
declare one instance and one static method, call all variables into both methods with print statement
declare main method, call both instance and static methods into main method
 */
public class Programme4 {
    int a = 10; //instance variable
    int b = 20; //instance variable
    static int c = 30; //static variable
    static int d = 40; //static variable

    public void method1() { //instance method
        System.out.println(a + b + Programme4.c + Programme4.d);
    }

    public static void method2() { //static method
        Programme4 obj1 = new Programme4();
        System.out.println(obj1.a + obj1.b + c + d);
    }

    public static void main(String[] args) { // main method
        Programme4 obj2 = new Programme4();
        obj2.method1();
        method2();
    }
}
