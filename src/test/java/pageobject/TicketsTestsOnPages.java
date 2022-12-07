package pageobject;

import org.junit.jupiter.api.Test;
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
        baseFunc.openUrl(URL);
        HomePage homePage = new HomePage(baseFunc);
        homePage.selectAirports(FROM_AIRPORT, TO_AIRPORT);

        PassengerInfoPage infoPage = new PassengerInfoPage(baseFunc);
        //...

        //Get List<WebElement> with Name, From Airport, To Airport
        //                     0                   1         2
        //.getText() --> String
        //String fromAirport = data.get(1).getText() -> "RIX"
        //Assertions.equals(FROM_AIRPORT, fromAirport, "Error message");
    }
}
