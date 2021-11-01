// 11. WAP to enter any String and count total number of 'a' in that String.
import java.util.Scanner;

public class CountA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = scanner.nextLine();

        findA(str);

    }

    private static void findA(String str) {
        int numOfAs = 0;
       for(int i = 0; i < str.length(); i++) {
           if(str.charAt(i) == 'a' || str.charAt(i) == 'A') {
                numOfAs++;
           }
       }
        System.out.println("Total number of 'a' in the given string = " + numOfAs);

    }
}

