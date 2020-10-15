import java.util.ArrayList;

public class Address {
    private String streetName, state;
    private int houseNumber,optionalApartmentNumber,postalCode;

    public Address (String streetName ,int houseNumber ,int optionalApartmentNumber ,String state ,int postalCode){
        this.streetName = streetName;
        this.houseNumber = houseNumber;
        this.optionalApartmentNumber = optionalApartmentNumber;
        this.state = state;
        this.postalCode = postalCode;
    }
    public getAddress() {
        return this.streetName,this.houseNumber,"Apartment number: "this.optionalApartmentNumber
    }
}
