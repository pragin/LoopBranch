import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        //Create a Scanner class object to read inputs from terminal
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number : ");
        int number = scanner.nextInt();

        findPrime(number);

    }

    public static void findPrime(int num){
        boolean isPrime = true;
        for(int i = 2; i <= num -1; i++){
            System.out.println(i);
            if(num % i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.format("The given number %d is a prime number", num);
        }else{
            System.out.format("The given number %d is not a prime number", num);
        }
    }
}
