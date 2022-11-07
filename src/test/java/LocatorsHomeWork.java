import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsHomeWork {

    // --------------------------------1 Stranica---------------------------------------

    private final By LOGO_BTN = By.xpath("logo-cell");
    //div[@class = 'logo-cell']

    private final By CURRENCY_BTN = By.xpath("currentCurrency");
    //a[@id = 'currentCurrency']

    private final By HOME_CAPTION = By.xpath("home-caption");
    //div[@class = 'home-caption']

    private final By LOG_IN_BTN = By.xpath("navigation-link action my-booking trigger-login-modal pointer");
    //a[@class = 'navigation-link action my-booking trigger-login-modal pointer']

    private final By PICKUP_DATE_INPUT_FIELD = By.xpath("pickDate");
    //input[contains(@name,'pickDate')]

    private final By DRIVER_RESIDENCE = By.xpath("sb-residence-text");
    //span[@class = 'sb-residence-text']

    private final By SEARCH_BTN =  By.xpath("location-submit");
    //button[@id = 'location-submit']

    private final By SLIDER_BTN = By.xpath("svg-slider-arrow");
    //div[@class = 'svg-slider-arrow']

    private final By REVIEWS = By.xpath("tp-widget-review");
    //div[@class = 'tp-widget-review']

    private final By SUBTITLE_TEXT = By.xpath("col-12");
    //div[@class = 'col-12']


    //------------------------------------------2 stranica--------------------------------------------------

    private final By CAR_TYPE_BTN = By.xpath("ar-top-filter-item car-groups-item filtering-event init");
    //div[@class ='car-top-filter-item car-groups-item filtering-event init']

    private final By CAR_TYPE_SLIDER = By.xpath("car-top-filter-control next");
    //div[@class ='car-top-filter-control next']

    private final By CAR_QUANTITY_TEXT = By.xpath("showing-cars");
    //span[@class ='showing-cars']

    private final By PRICE_FILTER_BTN = By.xpath("dc-ui dropdown-toggle text-blue-500");
    //a[@class = 'dc-ui dropdown-toggle text-blue-500']

    private final By BAG_QUANTITY_TEXT = By.xpath("");

    private final By MENU_LIST = By.xpath("flt-type");
    //div[@class = 'flt-type']

    private final By RENTAL_CONDITIONS_LINK = By.xpath("open-modal search-index trigger-gtm-rc rental-conditions with-logo");
    //a[@class ='open-modal search-index trigger-gtm-rc rental-conditions with-logo']

    private final By VIEW_CAR_BTN = By.xpath("ca-table-cell top");
    //div[@class = 'ca-table-cell top']

    private final By MIN_CAR_PRICE_TEXT = By.xpath("min-price");
    //span[@class = 'min-price']

    private final By PAYMENT_TYPE = By.xpath("dc-ui badge badge-medium badge-blue");
    //span[@class = 'dc-ui badge badge-medium badge-blue']

    private final By FUEL_TYPE_LABEL = By.xpath("Gasoline");
    //label[@data-event-label = 'Gasoline']

    private final By SEAT_NUMBER_LABEL = By.xpath("4 seats");
    //label[@data-event-label = '4 seats']

    private final By SUPPLIER_RATING_LABEL = By.xpath("supplier-rating");
    //div[@class= 'supplier-rating']

    private final By CURRENT_CAR_PRICE_LABEL = By.xpath("price-item-price-main");
    //div[@class= 'price-item-price-main']


    //----------------------------------------3 STRANICA--------------------------------------

    private final By LOADING_LOGO = By.xpath("lds-ellipsis v2");
    //div[@class='lds-ellipsis v2']
    private final By LOADING_TEXT = By.xpath("mt-24 mb-8 text-20 text-bold text-center");
    //div[@class='mt-24 mb-8 text-20 text-bold text-center']
    private final By LOADING_SUBTEXT = By.xpath("'mb-32 text-center");
    //div[@class='mb-32 text-center']

    public void openHomePageCheck () {
        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get("http://www.discovercars.com/");

    }

}
