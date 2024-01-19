import java.util.Scanner;
// define the public class
public class Main {
    public static double calculate(double num1, double num2, char operator) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                return num1 / num2;
            default:
                throw new IllegalArgumentException("Invalid operator");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = input.next().charAt(0);

        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();
// Exception Handling feature is added
        try {
            double result = calculate(num1, num2, operator);
            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: Invalid operator");
        }
    }
}