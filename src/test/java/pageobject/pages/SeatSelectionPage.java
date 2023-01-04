package pageobject.pages;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageobject.BaseFunc;

import java.util.List;

public class SeatSelectionPage {
    private final By SEAT = By.xpath(".//div[@class = 'seat']");
    private final By SELECTED_SEAT = By.xpath(".//div[@class = 'line']");
    private final By BOOK_BTN = By.id("book3");
    private BaseFunc baseFunc;

 /// code > generate - constructor
    public SeatSelectionPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    //vibiraem mesto i peredajom minimaljnoe kolichestvo mest
    public void selectSeat(int seatNr) {
        baseFunc.waitForMinElementsAmount(SEAT, 30);
    //sobiraem mesta v spisok
        List<WebElement> seats = baseFunc.findElements(SEAT);

        // nawli li mesto
        boolean isSeatFound = false;
        // for each // sleva peremennaja s tipom dannih // s prava spisok
        for (WebElement we: seats) {
            //dostajom text iz elementa, string > peredelivaem v int
            if (Integer.parseInt(we.getText()) == seatNr) {
                baseFunc.click(we);
                isSeatFound = true;
                break;
            }
        }

        Assertions.assertTrue(isSeatFound, "Seat Nr. " + seatNr + " is not found");
    }

    public int getSelectedSeatNr() {
        String selectedSeatInfo = baseFunc.findElement(SELECTED_SEAT).getText();
        return Integer.parseInt(StringUtils.getDigits(selectedSeatInfo));
    }

    public void book() {
        baseFunc.click(BOOK_BTN);
    }
}
