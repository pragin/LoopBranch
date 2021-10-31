import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter five consecutive integers : ");
        String numbers = scanner.nextLine();

        reverseNumbers(numbers);
    }

    public static void reverseNumbers(String numbers) {
        for(int i = numbers.length()-1; i >=0; i--){
            System.out.print(numbers.charAt(i));
        }
    }
}
