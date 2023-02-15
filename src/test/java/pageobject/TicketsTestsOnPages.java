package pageobject;

import com.beust.ah.A;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import pageobject.model.FlightInfo;
import pageobject.model.Passenger;
import pageobject.pages.HomePage;
import pageobject.pages.PassengerInfoPage;
import pageobject.pages.SeatSelectionPage;
import pageobject.pages.SuccesfulRegistrationPage;

public class TicketsTestsOnPages {
    //peremennaja v vide ssilki
    private final String URL = "qaguru.lv:8089/tickets/";

    //ispoljzuem basefunc
    private BaseFunc baseFunc = new BaseFunc();

    @Test
    public void successfulRegistrationTest() {
        //posle peremennih s class Passenger, tut mi ih zapolnjaem
        Passenger passenger = new Passenger("TestName", "TestSurname");

        int seatNr = RandomUtils.nextInt(1, 35);


        FlightInfo info = new FlightInfo("SFO", "RIX", "CCCCC", 2,1,4,
                "16-05-2018", seatNr);
        info.setPassenger(passenger);

        baseFunc.openUrl(URL);
        HomePage homePage = new HomePage(baseFunc);
        homePage.selectAirports(info.getDeparture(), info.getDestination());

        //posle vsego
        PassengerInfoPage infoPage = new PassengerInfoPage(baseFunc);
        infoPage.fillInPassengerInfo(info);

        Assertions.assertEquals(passenger.getFirstName(), infoPage.getPassengerName(), "Wrong name!");
        Assertions.assertEquals(info.getDeparture(), infoPage.getFirstFromAirport(), "Error!");
        Assertions.assertEquals(info.getDeparture(), infoPage.getSecondFromAirport(), "Error!");
        Assertions.assertEquals(info.getDestination(), infoPage.getFirstToAirport(), "Error");
        Assertions.assertEquals(info.getDestination(), infoPage.getSecondToAirport(), "Error");

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