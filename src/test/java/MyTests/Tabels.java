package MyTests;

import java.util.Arrays;

public class Tabels {

    public static void main(String[] args) {
        String[] products = {"Book","Pen","Pencil","Notebook","Stickers"};
        System.out.println(Arrays.toString(products));
        products[4] = "Pencil Case";
        System.out.println(Arrays.toString(products));
        System.out.println();

        String[][] orders = {{"Book","1"},{"Pen","5"},{"Pencil","2"},{"Notebook","8"},{"Pencil Case","1"}};
        System.out.println(Arrays.deepToString(orders));
        System.out.println();

        String orderName1 = orders[0][0];
        String orderNumber1 = orders[0][1];
        System.out.println("Ordered product name is " + orderName1 + "." + "\nOrdered product ammount is " + orderNumber1 +".");

    }
}
