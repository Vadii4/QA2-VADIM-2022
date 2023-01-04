package pageobject;

import com.beust.ah.A;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import pageobject.model.Passenger;
import pageobject.pages.HomePage;
import pageobject.pages.PassengerInfoPage;
import pageobject.pages.SeatSelectionPage;
import pageobject.pages.SuccesfulRegistrationPage;

public class TicketsTestsOnPages {
    //peremennaja v vide ssilki
    private final String URL = "qaguru.lv:8089/tickets/";
    private final String FROM_AIRPORT = "RIX";
    private final String TO_AIRPORT = "SFO";

    //ispoljzuem basefunc
    private BaseFunc baseFunc = new BaseFunc();

    @Test
    public void successfulRegistrationTest() {
        //posle peremennih s class Passenger, tut mi ih zapolnjaem
        Passenger passenger = new Passenger("TestName", "TestSurname", "CCCCC", 2,
                1, 4, "16-05-2018");

        int seatNr = RandomUtils.nextInt(1, 35);

        baseFunc.openUrl(URL);
        HomePage homePage = new HomePage(baseFunc);
        homePage.selectAirports(FROM_AIRPORT, TO_AIRPORT);

        //posle vsego
        PassengerInfoPage infoPage = new PassengerInfoPage(baseFunc);
        infoPage.fillInPassengerInfo(passenger);

        Assertions.assertEquals(passenger.getFirstName(), infoPage.getPassengerName(), "Wrong name!");
        Assertions.assertEquals(FROM_AIRPORT, infoPage.getFirstFromAirport(), "Error!");
        Assertions.assertEquals(FROM_AIRPORT, infoPage.getSecondFromAirport(), "Error!");
        Assertions.assertEquals(TO_AIRPORT, infoPage.getFirstToAirport(), "Error");
        Assertions.assertEquals(TO_AIRPORT, infoPage.getSecondToAirport(), "Error");

        Assertions.assertTrue(infoPage.getPrice().length() > 0, "ERROR");

        infoPage.book();

        //sozdaem otdeljnij ekzempljar(page)
        SeatSelectionPage seatSelectionPage = new SeatSelectionPage(baseFunc);
        seatSelectionPage.selectSeat(seatNr);

        int selectedSeat = seatSelectionPage.getSelectedSeatNr();
        Assertions.assertEquals(seatNr, selectedSeat, "Wrong seat selected");

        seatSelectionPage.book();
        //sozdaem otdeljnij ekzempljar(page)
        SuccesfulRegistrationPage succesfulRegistrationPage = new SuccesfulRegistrationPage(baseFunc);
        Assertions.assertTrue(succesfulRegistrationPage.isSuccessfulRegistrationTextAppears(), "Wrong text on successful registration page");
    }
}