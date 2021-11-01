import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Get user input
        System.out.print("Please enter a whole number : ");
        int n = scanner.nextInt();

        findSumOfNaturalNumbers(n);

    }

    private static void findSumOfNaturalNumbers(int n) {
        int sumOfNums = 0;
        for (int i = 0; i <= n ; i++){
            sumOfNums = sumOfNums +i;
        }

        System.out.format("Sum of %d natural number = %d " , n, sumOfNums);
    }
}
