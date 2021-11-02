//Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number) – limitation is n.

import java.util.Scanner;

public class FibonacciNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the value of n : ");
        int n = scanner.nextInt();
        //Pass the entered value to the method to print Fibonacci Series
        printSeries(n);
    }

    public static void printSeries(int n){
        int numOne = 0;
        int numTwo = 1;
        int numThree;
        System.out.print(numOne + ", " + numTwo + ", ");
        for(int i = 2 ; i<=n; i++){
            numThree = numOne +numTwo;
            System.out.print(numThree+ ", ");
            numOne = numTwo;
            numTwo = numThree;

        }

    }
}
