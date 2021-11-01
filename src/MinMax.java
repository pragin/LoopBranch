import java.util.Scanner;

// 12. Write a program in Java to find min and max number from any 3 numbers which user enters.
public class MinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Ask the user to enter three numbers
        System.out.print("Enter the first number : ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third number : ");
        int num3 = scanner.nextInt();

        findMinMax(num1,num2,num3);

        }

    private static void findMinMax(int num1, int num2, int num3) {

        System.out.println("Max : " + Math.max(Math.max(num1,num2),num3));
        System.out.println("Min : " + Math.min(Math.min(num1,num2),num3));
    }
}
