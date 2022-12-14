import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

/////////VNACHALE LOCATORI
public class TicketsTests {
    private final By FROM = By.id("afrom");
    private final By TO = By.id("bfrom");
    private final By GO_BTN = By.xpath(".//span[@class = 'gogogo']");

    private final By AIRPORT_NAME = By.xpath(".//span[@class ='bTxt']");

    private final By GET_PRICE_BTN = By.xpath(".//span[contains(@onclick,'setLang')]");

    private final By BOOK_BTN = By.xpath(".//span[@id= 'book2']");

    private final By SECOND_BOOK_BTN = By.xpath(".//span[@id= 'book3']");

    private final By SEAT_BTN = By.xpath(".//div[@class = 'seat']");


    private final By FIRST_NAME = By.id("name");
    private final By LAST_NAME = By.id("surname");
    private final By DISCOUNT = By.id("discount");
    private final By ADULTS = By.id("adults");
    private final By CHILDREN = By.id("children");
    private final By BAG = By.id("bugs");
    private final By FLIGHT = By.id("flight");

    private WebDriver browser;
    private WebDriverWait wait;
/// OTKRIVAEM SAIT
    @Test
    public void reservationCheck () {

        //TEst data
        String selectedAirportFrom = "RIX";
        String selectedAirportTo = "SFO";


        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get("http://www.qaguru.lv:8089/tickets/");

        wait = new WebDriverWait(browser, Duration.ofSeconds(10));

        //peredajom v private void select vnizu
        select(FROM, "RIX");
        select(TO, "SFO");

        browser.findElement(GO_BTN).click();

        //peredajom v private void type vnizu
        type(FIRST_NAME, "Vadim");
        type(LAST_NAME, "Tarlecky");
        type(DISCOUNT, "12345");
        type(ADULTS, "1");
        type(CHILDREN, "0");
        type(BAG, "1");
        select(FLIGHT, "13");

        browser.findElement(GET_PRICE_BTN).click();

        //airportFrom(selectedAirportFrom);
        //airportTo(selectedAirportTo);

        //List<WebElement> airports = browser.findElements(AIRPORT_NAME);
        //String selectedAirportFrom = airports.get(1).getText();
        //String selectedAirportTo = airports.get(2).getText();

        Assertions.assertEquals(AIRPORT_NAME, selectedAirportFrom, "same airport");
        Assertions.assertEquals(AIRPORT_NAME, selectedAirportTo, "same airport");

        browser.findElement(BOOK_BTN).click();
        wait = new WebDriverWait(browser, Duration.ofSeconds(10));
        browser.findElement(SEAT_BTN).click();
        browser.findElement(SECOND_BOOK_BTN).click();

        //proverka
        //equals --chto to s chem to sravnivaem
        //Student student = new Student();
        //student.setFirstName("Artis");

        //String text = "Artis is the best QA";
        //String secondText = "Artis is a bit funny!";

        //String firstName = text.split("")[0];
        //String secondName = secondText.split("")[0];
        //Assertions.assertEquals(firstName, secondName, "Wrong");

        //Assertions.assertTrue(text.startsWith(student.getFirstName()),"Wrong Name");
        //Assertions.assertTrue(secondText.startsWith(student.getFirstName()),"Wrong Name");
    }
        //znachenija peredajutsa sjuda
    private void select(By locator, String value) {
        WebElement we = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        Select select = new Select(we);
        select.selectByValue(value);
    }

    private void type(By locator, String text){
        WebElement input = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        input.clear();
        input.sendKeys(text);
    }
}