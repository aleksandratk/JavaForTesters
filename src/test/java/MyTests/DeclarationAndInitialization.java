package MyTests;

public class DeclarationAndInitialization {
    public static void main(String[] args) {
        System.out.println("Declaration and initialization of variables.");
        String firstPart = "Starts with classical... \n";
        String secondPart = "Hello World :)";
        System.out.println(firstPart + secondPart);
        System.out.println();

        byte zmByte = Byte.MIN_VALUE;
        byte zmByte2 = Byte.MAX_VALUE;
        System.out.println("The variable byte is between "+ zmByte + " and " + zmByte2 + ".");

        short zmShort = Short.MIN_VALUE;
        short zmShort2 = Short.MAX_VALUE;
        System.out.println("The variable short is between "+ zmShort + " and " + zmShort2 + ".");

        int zmInt = Integer.MIN_VALUE;
        int zmInt2 = Integer.MAX_VALUE;
        System.out.println("The variable integer is between  "+ zmInt + " and " + zmInt2 + ".");

        long zmLong = Long.MIN_VALUE;
        long zmLong2 = Long.MAX_VALUE;
        System.out.println("The variable long is between "+ zmLong + " and " + zmLong2 + ".");

        float zmFloat = Float.MIN_VALUE;
        float zmFloat2 = Float.MAX_VALUE;
        System.out.println("The variable float is between  "+ zmFloat + " and " + zmFloat2 + ".");

        double zmDouble = Double.MIN_VALUE;
        double zmDouble2 = Double.MAX_VALUE;
        System.out.println("The variable double is between  "+ zmDouble + " and " + zmDouble2 + ".");
        System.out.println();

        char zmChar = '\u0061';
        char zmChar2 = '\u0062';
        char zmChar3 = 'c';
        System.out.println("The char variable stores individual characters such as : "+ zmChar +","+ zmChar2 + ","+ zmChar3+".");

        System.out.println();
        String text = "Java programming language.";
        System.out.println("I'm learning " + text );
    }
}
