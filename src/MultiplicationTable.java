import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a non-negative number to print the corresponding multiplication table : ");
        int number = scanner.nextInt();

        if(number > 0) {
            printTable(number);
        }else{
            System.out.println("!!! Pleases enter a number greater than 0 !!! ");
        }
    }

    private static void printTable(int number) {
        for(int i=1; i <=12;i++){
            System.out.print(number + " x " + i + " = " + number * i);
            System.out.println();
        }
    }

}
