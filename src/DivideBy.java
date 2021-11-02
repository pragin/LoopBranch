// 9. WAP to print the numbers between 1 to 100 which can be divided by 3 and 5 separately

public class DivideBy {
    public static void main(String[] args) {
        String dividedByFive = "";
        String dividedByThree = "";
        for(int i = 1; i <=100; i++){
            if(i % 3 == 0){
                dividedByThree = dividedByThree + " " + i  ;
            }

            if(i % 5 == 0){
                dividedByFive = dividedByFive + " " +i;
            }
        }
        System.out.println("Numbers between 1 to 100 which can be divided by 3 : " + dividedByThree);
        System.out.println("Numbers between 1 to 100 which can be divided by 5 : " + dividedByFive);
    }
}
