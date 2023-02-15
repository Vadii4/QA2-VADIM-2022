package pageobject.model;
//sozdaem otdeljnij object i klass dlja zapolnenija
public class Passenger {
    private String firstName;
    private String lastName;

    public Passenger(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //CNTRL+A > CODE>GENERATE > GETTERS
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
