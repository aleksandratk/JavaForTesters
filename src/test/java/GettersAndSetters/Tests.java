package GettersAndSetters;

import org.junit.Test;

public class Tests {
    @Test
    public void gettersAndSettersTest() {
        Customer customer = new Customer();
        customer.setAge(15);
        System.out.println(customer.getAge());
    }

    @Test
    public void gettersAndSettersObjectTest(){
        Customer customer = new Customer();
        Address address = new Address("Wroclaw","Piłsudskiego", "2");
        customer.setAddress(address);
        System.out.println("Address: " +
                customer.getAddress().getStreetName() + " " +
                customer.getAddress().getFlatNumber() + ", " +
                customer.getAddress().getCityName() + ".");
    }
}
