package MyTests;

import org.junit.Assert;

import org.junit.Test;

public class ReferencesTypes {
   @Test
    public void example() {
       int firstNumber = 2;
       int secondNumber = firstNumber;
       firstNumber = 6;

       if (secondNumber == 4) {
           System.out.println("The second number is equal to the first number and their value is 2");
       } else {
           System.out.println("The second number isn't equal to the first number. Second number value is still 2.");
       }
   }
    @Test
    public void example2(){
    String car = "Mercedes";
    String car2 = car;
    car = "Porshe";
    switch (car2){
        case ("Porshe"):
            System.out.println("The name of car2 changed into the name of a car.");

        case ("Mercedes"):
            System.out.println("The name of car2 didn't change.");
            break;
        default:
            throw new IllegalStateException("Unexpected value: " + car2);
    }

    }


}
