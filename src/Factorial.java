import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        //Create scanner class object
        Scanner scanner = new Scanner(System.in);
        // Ask for user input n
        System.out.println("Please enter a non-negative integer which is greater than 0 : ");
        int n = scanner.nextInt();

        if(n>0) {
            System.out.println("The factorial of " + n + " is equal to " + findFactorial(n));
        }else{
            System.out.println("!!! Please enter a non-negative integer which is greater than 0 !!!");
        }
    }

    public static int findFactorial(int n){
        int factorial = 1;
        for(int i=n; i>=1; i--){
            System.out.println(factorial);
            factorial = factorial  * (n-1);
        }
        return factorial;
    }
}
