import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class AmazonHW {
    private final By AMAZON_ACCEPT_COOKIES_BTN = By.id("sp-cc-accept");
    private final By AMAZON_CONTINUE_BTN = By.xpath(".//input[@data-action-type = 'DISMISS']");
    private final By AMAZON_MAIN_MENU_ITEM = By.xpath(".//div[@id = 'nav-xshop']/a");
    private WebDriver browser;
    private WebDriverWait wait;
    @Test
    public void amazonTest() {

        //TEST DATA
        String menuItemToSelect = "Best Sellers";


        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get("http://amazon.de");

        wait = new WebDriverWait(browser, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.elementToBeClickable(AMAZON_ACCEPT_COOKIES_BTN));
        browser.findElement(AMAZON_ACCEPT_COOKIES_BTN).click();

        wait.until(ExpectedConditions.elementToBeClickable(AMAZON_CONTINUE_BTN));
        browser.findElement(AMAZON_CONTINUE_BTN).click();

        openMenuItem(menuItemToSelect);

        private void openMenuItem(String menuItemToSelect) {
            List<WebElement> menuItems = browser.findElements(AMAZON_MAIN_MENU_ITEM);
            for (WebElement we: menuItems) {
                if (we.getText().equals(menuItemToSelect)) {
                    we.click();
                    break;
                }
            }
        }

    }
}
