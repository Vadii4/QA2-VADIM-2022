package pageobject;

import com.beust.ah.A;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import pageobject.model.Passenger;
import pageobject.pages.HomePage;
import pageobject.pages.PassengerInfoPage;

public class TicketsTestsOnPages {
    //peremennaja v vide ssilki
    private final String URL = "qaguru.lv:8089/tickets/";
    private final String FROM_AIRPORT ="RIX";
    private final String TO_AIRPORT = "SFO";

    //ispoljzuem basefunc
    private BaseFunc baseFunc = new BaseFunc();
    @Test
    public void successfulRegistrationTest () {
        //posle peremennih s class Passenger, tut mi ih zapolnjaem
        Passenger passenger = new Passenger("TestName", "TestSurname","CCCCC", 2,
                1,4,"16-05-2018");

        baseFunc.openUrl(URL);
        HomePage homePage = new HomePage(baseFunc);
        homePage.selectAirports(FROM_AIRPORT, TO_AIRPORT);

        //posle vsego
        PassengerInfoPage infoPage = new PassengerInfoPage(baseFunc);
        infoPage.fillInPassengerInfo(passenger);

        Assertions.assertEquals(passenger.getFirstName(), infoPage.getPassengerName(),"Wrong name!");
        Assertions.assertEquals(FROM_AIRPORT, infoPage.getFirstFromAirport(), "Error!");
        Assertions.assertEquals(FROM_AIRPORT, infoPage.getSecondFromAirport(), "Error!");
        Assertions.assertEquals(TO_AIRPORT, infoPage.getFirstToAirport(), "Error");
        Assertions.assertEquals(TO_AIRPORT, infoPage.getSecondToAirport(), "Error");

        Assertions.assertTrue(infoPage.getPrice().length() > 0, "ERROR");
    }
}
