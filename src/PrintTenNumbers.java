// 1. Print any 10 numbers between given/user input
//    range. For eg. Print numbers between 23-33

import java.util.Scanner;

public class PrintTenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Ask the user to enter start and end
        System.out.println("Please enter the starting number : ");
        int startNum = scanner.nextInt();
        System.out.println("Please enter the ending number (Must be higher than the start");
        int endNum = scanner.nextInt();

        //Pass the values to the method
        printNums(startNum, endNum);

    }

    public static void printNums(int start, int end){
        for(int i = start; i < start+10; i++ ){
            System.out.println(i);
        }
    }
}
