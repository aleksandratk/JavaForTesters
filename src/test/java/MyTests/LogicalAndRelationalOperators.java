package MyTests;

public class LogicalAndRelationalOperators{
        public static void main(String[] args) {
            System.out.println("Logical operators.");
            //It's time for logical operators
            System.out.println();

            int first = 1;
            int second = 2;
            int third = 3;
            System.out.println("int first = 1" + "\nint second = 2" + "\nint third = 3");
            System.out.println();

            System.out.println("statement = first < second");
            boolean statement = first < second;
            System.out.println("The first statement is " + statement + ". The first number is smaller than the second.");
            System.out.println();

            System.out.println("statement2 = first > third");
            boolean statement2 = first > third;
            System.out.println("The second statement is " + statement2 + ". The first number is smaller than the third.");
            System.out.println();

            System.out.println("statement3 = second > third");
            boolean statement3 = second > third;
            System.out.println("The third statement is " + statement3 + ". The second number is smaller than the third.");
            System.out.println();

            System.out.println("statement4 = (first + second == third)");
            boolean statement4 = (first + second == third);
            System.out.println("The forth statement is " + statement4 + ". The sum of first and second numbers are equal the third number.");
            System.out.println();

            System.out.println("statement5 = (first != third)");
            boolean statement5 = (first != third);
            System.out.println("The fifth statement is " + statement5 + ". The first number is different than the third number.");
            System.out.println();

            System.out.println("statement6 = statement && statement2");
            boolean statement6 = statement && statement2;
            System.out.println("The sixth statement is "+ statement6 +" because both of the compared statement are true.");
            System.out.println();

            System.out.println("statement7 = statement || statement2");
            boolean statement7 = statement || statement2;
            System.out.println("The seventh statement is "+ statement7 +" because at least one of the compared statement are true.");
            System.out.println();

            System.out.println("statement8 = statement == statement2");
            boolean statement8 = statement == statement2;
            System.out.println("The eighth statement is "+ statement8 +" because the compared statements are not both true.");

        }
}
