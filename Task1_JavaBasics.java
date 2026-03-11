import java.util.Scanner;

class Calculator {

    int num1;
    int num2;

    // Constructor
    Calculator(int a, int b) {
        num1 = a;
        num2 = b;
    }

    // Methods
    void add() {
        System.out.println("Addition: " + (num1 + num2));
    }

    void subtract() {
        System.out.println("Subtraction: " + (num1 - num2));
    }

    void multiply() {
        System.out.println("Multiplication: " + (num1 * num2));
    }

    void divide() {
        if (num2 != 0) {
            System.out.println("Division: " + (num1 / num2));
        } else {
            System.out.println("Division by zero is not allowed.");
        }
    }
}

public class Task1_JavaBasics {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Creating object
        Calculator calc = new Calculator(a, b);

        // Calling methods
        calc.add();
        calc.subtract();
        calc.multiply();
        calc.divide();
    }
}
