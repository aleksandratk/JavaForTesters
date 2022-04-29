package MyTests;

import java.util.Scanner;

public class ConditionalStatementsAndLoops {


    public static void main(String[] args) {
        System.out.println("Logical operators.");
        //It's time for logical operators, conditional statement IF,SWITCH  Loops: WHILE, DO WHILE , FOR, FOR EACH");
        System.out.println();

        int firstNumber = 2;
        int secondNumber = 4;
        int thirdNumber = 1;

        System.out.println();
        if (thirdNumber > firstNumber) {
            System.out.println("The third number is bigger than the first.");
        } else {
            if (thirdNumber < firstNumber) {
                System.out.println("The third number is smaller than the first.");
            } else {
                System.out.println("The third number is equal the first.");
            }
        }

        System.out.println();
        System.out.println("Type number between 0 and 100:");
        Scanner scanner = new Scanner(System.in);
        int typeIn = scanner.nextInt();
        if (typeIn < 0 || typeIn >100) {
            System.out.println("You have typed wrong number. Please try again later:");
        }
           else {
               if (typeIn == 0 || typeIn <= 100){
                System.out.println("You have typed the right number.");
                }
           }

        System.out.println();

        /*switch*/
        int number = 2;
        switch(number) {
            case 0:
                System.out.println("The number is 0.");
                break;
            case 1:
                System.out.println("The number is 1.");
                break;
            case 2:
                System.out.println("The number is 2.");
                break;
            default :
                System.out.println("The number is incorrect.");
                break;
        }
        System.out.println();
        /* while */

        int factorial6 = countFactorial(6);
        System.out.println("The factorial of number 6 is " + factorial6 + ".");
        System.out.println();

        /* do while */
        int value = 5;
        do{
        value++;
        }
        while(value<10);
        System.out.println("New value after the \"do while\" loop is "+ value + ".");
        System.out.println();

        for (int i = 1; i <= 6; i++) {
            System.out.println("The \"FOR\" loop performed " + i + " time.");
            }
        System.out.println();// For the "FOR" loop I will create the table.

        /* FOR EACH */
        System.out.println();

        String[] sports = {"Football", "Basketball", "Tennis", "Volleyball"};
        String sportsList = "List of sports : ";
            for (String sport : sports) {
                sportsList = sportsList + "\n" + sport;
            }
        System.out.println(sportsList);
        System.out.println();

    }

    private static int countFactorial(int number) {
        int factorial = 1;
        int i = 2;
    if (number>1){
        while (i<=number) {
            factorial = factorial*i;
            i++;
        }
    }
        return factorial;
    }
}


    