import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsHomeWork {

    // --------------------------------1 Stranica---------------------------------------

    private final By LOGO_BTN = By.xpath(".//div[@class = 'logo-cell']");

    private final By CURRENCY_BTN = By.xpath(".//a[@id = 'currentCurrency']");

    private final By HOME_CAPTION = By.xpath(".//div[@class = 'home-caption']");

    private final By LOG_IN_BTN = By.xpath(".//a[@class = 'navigation-link action my-booking trigger-login-modal pointer']");

    private final By PICKUP_DATE_INPUT_FIELD = By.xpath(".//input[contains(@name,'pickDate')]");

    private final By DRIVER_RESIDENCE = By.xpath(".//span[@class = 'sb-residence-text']");

    private final By SEARCH_BTN =  By.xpath(".//button[@id = 'location-submit']");

    private final By SLIDER_BTN = By.xpath(".//div[@class = 'svg-slider-arrow']");

    private final By REVIEWS = By.xpath(".//div[@class = 'tp-widget-review']");

    private final By SUBTITLE_TEXT = By.xpath(".//div[@class = 'col-12']");

    //------------------------------------------2 stranica--------------------------------------------------

    private final By CAR_TYPE_BTN = By.xpath(".//div[@class ='car-top-filter-item car-groups-item filtering-event init']");

    private final By CAR_TYPE_SLIDER = By.xpath(".//div[@class ='car-top-filter-control next']");

    private final By CAR_QUANTITY_TEXT = By.xpath(".//span[@class ='showing-cars']");

    private final By PRICE_FILTER_BTN = By.xpath(".//a[@class = 'dc-ui dropdown-toggle text-blue-500']");

    private final By BAG_QUANTITY_TEXT = By.xpath("");

    private final By MENU_LIST = By.xpath(".//div[@class = 'flt-type']");

    private final By RENTAL_CONDITIONS_LINK = By.xpath(".//a[@class ='open-modal search-index trigger-gtm-rc rental-conditions with-logo']");

    private final By VIEW_CAR_BTN = By.xpath(".//div[@class = 'ca-table-cell top']");

    private final By MIN_CAR_PRICE_TEXT = By.xpath(".//span[@class = 'min-price']");

    private final By PAYMENT_TYPE = By.xpath(".//span[@class = 'dc-ui badge badge-medium badge-blue']");

    private final By FUEL_TYPE_LABEL = By.xpath(".//label[@data-event-label = 'Gasoline']");

    private final By SEAT_NUMBER_LABEL = By.xpath(".//label[@data-event-label = '4 seats']");

    private final By SUPPLIER_RATING_LABEL = By.xpath(".//div[@class= 'supplier-rating']");

    private final By CURRENT_CAR_PRICE_LABEL = By.xpath(".//div[@class= 'price-item-price-main']");


    //----------------------------------------3 STRANICA--------------------------------------

    private final By LOADING_LOGO = By.xpath(".//div[@class='lds-ellipsis v2']");

    private final By LOADING_TEXT = By.xpath("//div[@class='mt-24 mb-8 text-20 text-bold text-center']");

    private final By LOADING_SUBTEXT = By.xpath(".//div[@class='mb-32 text-center']");

    public void openHomePageCheck () {
        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get("http://www.discovercars.com/");

    }

}
