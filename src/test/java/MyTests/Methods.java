package MyTests;

import org.junit.Test;

public class Methods {
    @Test
    public static void main(String[] args) {

        double triangleSquare1 = triangleSquare(2, 4);
        System.out.println("Counted trinagle square is " + triangleSquare1 + ".");

        int incrementation1 = incrementation(3);
        System.out.println("The incrementation of number x is " + incrementation1 + ".");

        int decrementation1 = decrement(3);
        System.out.println("The decrement of number x is " + decrementation1 + ".");

        int result1 = mathematicalOperations(5,10,4);
        System.out.println("The result of mathematical operations is "+ result1 + ".");

        typeTestEnd();

    }
        static void typeTestEnd(){
        System.out.println("Test has successfully completed.");
        }

        public static int mathematicalOperations(int x, int y, int z){
        int result = x * y + z + x - y / x ;
        return result;
        }
        
        public static int decrement(int x){
        int z = --x;
        return z;
        }

        public static int incrementation(int x){
        int y = ++x;
        return y;
        }

        public static double triangleSquare(double base,double height){
            double countedTriangleSquare = (base * height) / 2;
            return countedTriangleSquare;
        }

    }








