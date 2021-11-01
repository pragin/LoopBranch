//8. write a program that prints the sum of x ranging from 1 to 20.

public class SumOfNumbers {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1 ; i <= 20; i++){
            sum = sum + i;
        }

        System.out.println("The sum of x ranging from 1 to 20  = " + sum);

    }
}
