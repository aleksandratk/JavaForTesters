package GettersAndSetters;

public class Address {

    String city;
    String street;
    String flat;

    public Address(String cityName, String streetName, String flatNumber) {
        city = cityName;
        street = streetName;
        flat = flatNumber;
    }
        public String getCityName () {
            return city;
        }
        public String getStreetName () {
            return street;
        }
        public String getFlatNumber () {
            return flat;
        }

        public void setCity(String cityName){
        city = cityName;
        }

}

