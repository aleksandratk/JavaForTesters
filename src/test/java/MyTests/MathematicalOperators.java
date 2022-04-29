package MyTests;

import org.junit.Test;

public class MathematicalOperators {

        public static void main(String[] args){

            int firstNumber = 5;
            int  secondNumber = 2;

            System.out.println("The variable firstNumber has been correctly declarated and implemented.");
            System.out.println("The variable secondNumber has been correctly declarated and implemented.");
            System.out.println();

            String information2 = "Mathematical operations.";
            System.out.println(information2);
            System.out.println();
            System.out.println("The first number is 5.");
            System.out.println("The second number is 2.");
            int additionResult = firstNumber + secondNumber;
            System.out.println("The result of addition is " + additionResult + ".");

            int subtractionResult = firstNumber - secondNumber;
            System.out.println("The result of subtraction is " + subtractionResult + ".");

            int multiplicationResult = firstNumber * secondNumber;
            System.out.println("The result of multiplication is " + multiplicationResult + ".");

            double dividingResult = (double)firstNumber / secondNumber;
            System.out.println("The result of dividing is " + dividingResult + ".");

            double restOfTheDivision = (double)firstNumber % secondNumber;
            System.out.println("The rest from dividing is " + restOfTheDivision + ".");
            System.out.println();

        }

    }
