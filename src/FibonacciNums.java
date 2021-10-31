//Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number) – limitation is n.

import java.util.Scanner;

public class FibonacciNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the value of n : ");
        int n = scanner.nextInt();
        //Pass the entered value to the method to print Fibonacci Series
        printSeries(n);
    }

    public static void printSeries(int n){
        for(int i = 1; i<n; i++){

        }

    }
}
