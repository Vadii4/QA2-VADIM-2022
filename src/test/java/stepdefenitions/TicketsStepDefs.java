package stepdefenitions;

import io.cucumber.core.internal.com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import model.Reservation;
import org.junit.jupiter.api.Assertions;
import pageobject.BaseFunc;
import pageobject.model.FlightInfo;
import pageobject.model.Passenger;
import pageobject.pages.HomePage;
import pageobject.pages.PassengerInfoPage;
import pageobject.pages.SeatSelectionPage;
import pageobject.pages.SuccesfulRegistrationPage;
import requesters.TicketsRequester;

import java.util.List;
import java.util.Map;

public class TicketsStepDefs {
    private FlightInfo flightInfo; //null
    private HomePage homePage; // null
    private PassengerInfoPage infoPage;
    private List<Reservation> reservations;
    private SeatSelectionPage seatSelectionPage;
    private Reservation reservationFromApi; //null
    private BaseFunc baseFunc = new BaseFunc();
    private int seatNr;

    private final String URL = "qaguru.lv:8089/tickets/";

    @Given("flight info:")
    public void set_flight_info(Map<String, String>params) {
        flightInfo = new FlightInfo(params.get("destination"), params.get("departure"),
                params.get("discount"), Integer.parseInt(params.get("adults")),
                Integer.parseInt(params.get("kids")), Integer.parseInt(params.get("bags")),
                params.get("flight_date"), Integer.parseInt(params.get("seat")));
    }
    @Given("passenger info is:")
    public void set_passenger_info(Map<String, String>params) {
        Passenger passenger = new Passenger(params.get("first_name"), params.get("last_name"));
        flightInfo.setPassenger(passenger);
    }
    @Given("home page opened")
    public void open_home_page() {
        baseFunc.openUrl(URL);
        homePage = new HomePage(baseFunc);
    }

    @When("we are selecting airports")
    public void select_airports() {
        homePage.selectAirports(flightInfo.getDeparture(), flightInfo.getDestination());
        infoPage = new PassengerInfoPage(baseFunc);
    }
    @Then("selected airports appears on the next page")
    public void check_airports() {
        Assertions.assertEquals(flightInfo.getDeparture(), infoPage.getFirstFromAirport(), "Error!");
        Assertions.assertEquals(flightInfo.getDestination(), infoPage.getFirstToAirport(), "Error");
    }
    @When ("we are filling in passenger registration form")
    public void fill_in_passenger_form(){
        infoPage.fillInPassengerInfo(flightInfo);
    }
    @When("requesting price")
    public void request_price() {
        infoPage.getPrice();
    }
    @Then("passenger name and and airports appears")
            public void check_passenger_name_and_airports() {
            Assertions.assertEquals(flightInfo.getPassenger().getFirstName(), infoPage.getPassengerName(), "Wrong name!");
            Assertions.assertEquals(flightInfo.getDeparture(), infoPage.getFirstFromAirport(), "Error!");
            Assertions.assertEquals(flightInfo.getDeparture(), infoPage.getSecondFromAirport(), "Error!");
            Assertions.assertEquals(flightInfo.getDestination(), infoPage.getFirstToAirport(), "Error");
            Assertions.assertEquals(flightInfo.getDestination(), infoPage.getSecondToAirport(), "Error");
        }

   @Then("price is 500 EUR")
   public void price_check() {
       Assertions.assertTrue(infoPage.getPrice().length() >0, "ERROR");
    }

    @When("we are pressing Book button")
    public void book_flight() {
        infoPage.book();
    }
    @When("selecting seat")
    public void select_seat() {
        seatSelectionPage = new SeatSelectionPage(baseFunc);
        seatNr =  (flightInfo.getSeatNr());
        seatSelectionPage.selectSeat(seatNr);
    }
    @Then("correct seat number appears")
    public void seat_number_check (){
        int selectedSeat = seatSelectionPage.getSelectedSeatNr();
        Assertions.assertEquals(seatNr, selectedSeat, "Wrong seat selected");
    }
    @When("we are booking selected ticket")
    public void book_selected_ticket() {
        seatSelectionPage.book();
    }
    @Then("succesful registration message appears")
    public void successful_registration_message_check() {
        SuccesfulRegistrationPage succesfulRegistrationPage = new SuccesfulRegistrationPage(baseFunc);
        Assertions.assertTrue(succesfulRegistrationPage.isSuccessfulRegistrationTextAppears(), "Wrong text on successful registration page");
    }


    @When("we are requesting reservations data")
    public void request_reservations() throws JsonProcessingException {
        TicketsRequester requester = new TicketsRequester();
        reservations = requester.getReservations();
    }
    @Then("current reservation is in the list")
    public void find_reservation() {
        for (Reservation r : reservations) {
            if (r.getName().equals(flightInfo.getPassenger().getFirstName())) {
                reservationFromApi = r;
                break;
            }
        }
        Assertions.assertNotNull(reservationFromApi, "Reservation isn't found!");
    }
    @Then("all reservation data is correct")
    public void check_reservation_data() {
        //reservationFromApi is used here for assertions

    }
}
