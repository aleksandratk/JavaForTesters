package GettersAndSetters;

public class Customer {
    private String name;
    private String lastname;
    int age;
    private Address address;

    public Address getAddress() {
        return address;
    }


    public void setAge(int ageParameter ) {
        if(ageParameter<0) throw new IllegalArgumentException("Age can't be negative number.");
        age = ageParameter;

    }

    public int getAge() {
    return age;
    }

    public void setAddress(Address addressParameter) {
        address = addressParameter;
    }
}
