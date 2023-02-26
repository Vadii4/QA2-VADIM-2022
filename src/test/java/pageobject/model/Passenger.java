package pageobject.model;

import org.apache.commons.lang3.RandomStringUtils;

//sozdaem otdeljnij object i klass dlja zapolnenija
public class Passenger {
    private String firstName;
    private String lastName;

    public Passenger(String firstName, String lastName) {
    if (firstName.equals("random")){
            this.firstName = RandomStringUtils.randomAlphabetic(10);
        } else{
            this.firstName = firstName;
        }

        //this.firstName = firstName.equals("random") ? RandomStringUtils.randomAlphabetic(10) : firstName;
        //               |----------uslovie-----------|----------------------true----------------|-----false---|

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
