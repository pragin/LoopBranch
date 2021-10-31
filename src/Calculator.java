//7. Making Calculator using the switch statement(The
//   program takes three inputs from the user:one
//   operator and 2 numbers. Based on the operator
//   provided by the user, it performs the calculation on
//   the numbers. Then the result is displayed on the
//   screen.)

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Ask for the first number
        System.out.print("Please enter number 1 : ");
        double num1 = scanner.nextDouble();
        // Ask for the second number
        System.out.print("Please enter number 2 : ");
        double num2 = scanner.nextDouble();
        // Ask for the operator
        System.out.print("Please enter one of the four operators (+, -, *, /):");
        char operator = scanner.next().charAt(0);

        calculate(num1, num2, operator);

    }

    private static void calculate(double num1, double num2, char operator) {
        double result = 0.0;
        switch (operator){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Please enter one of the four operators from the list (+, -, *, /) ");
        }

        System.out.format("%.2f %c %.2f = %.2f", num1, operator, num2, result);
    }
}
