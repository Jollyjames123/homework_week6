package homework;

/*
declaring two instance variables and one instance method
calling these variables inside method with print statement
declare main method
call instance method in to main method.
*/
public class Programme1 {
    int a = 5; //instance variable
    int b = 10; //instance variable

    public void method1() { //instance method
        System.out.println(a * b);
    }

    public static void main(String[] args) { //main method

        Programme1 obj = new Programme1(); //object created
        obj.method1();

    }
}
