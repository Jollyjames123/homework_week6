package homework;

/*
Declare one instance and one static variable
declare one instance and one static method call both variables into both methods
declare main method and call both instance and static method into main method
 */
public class Programme3 {
    int a = 10;         //instance variable
    static int b = 20;  //static variable

    public void method1() { //instance method
        System.out.println(a + Programme3.b);

    }

    public static void method2() {  //static method
        Programme3 obj1 = new Programme3();
        System.out.println(obj1.a + b);
    }

    public static void main(String[] args) {    //main method
        Programme3 obj2 = new Programme3();
        obj2.method1();
        method2();
    }
}
