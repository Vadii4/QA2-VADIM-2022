package stepdefenitions;

import io.cucumber.core.internal.com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import model.WeatherResponse;
import org.junit.jupiter.api.Assertions;
import requesters.WeatherRequester;

import java.util.List;
import java.util.Map;



public class WeatherStepDefs {
    private long cityID;
    private WeatherResponse response; //null
    @Given("city ID is: {long}")
    public void set_city_id(long cityId) {
        this.cityID = cityId;
    }

    @When("we are requesting weather forecast")
    public void request_weather() throws JsonProcessingException {
        WeatherRequester requester = new WeatherRequester();
        response = requester.requestWeather(cityID);
    }
    @Then("coordinates are:")
    public void check_coordinates(Map<String, Double> params){
        Assertions.assertEquals(params.get("latitude"), response.getLat(), "Wrong Lat!");
        Assertions.assertEquals(params.get("longitude"), response.getLon(), "Wrong Lon!");
    }
    @Then("timezone information is:")
    public void check_timezone(Map<String, String>params) {

    }
    @Then("current weather data is:")
    public void current_current_weather(Map<String, String>params) {

    }
    @Then("current weather description is:")
    public void current_weather_description(Map<String, String>params){

    }
    @Then("minutely information is:")
    public void minutely_weather_information(Map<String, String>params){

    }

    @Then("hourly weather data is:")
    public void hourly_weather_data(Map<String, String>params){

    }

    @Then("hourly weather description is:")
    public void hourly_weather_description(Map<String, String>params){

    }

    @Then("daily weather data is:")
    public void daily_weather_data(Map<String, String>params){

    }

    @Then("temperature for daily weather is:")
    public void daily_weather_temperature(Map<String, String>params){

    }
    @Then("daily weather feels like temperature is:")
    public void daily_weather_feels_like(Map<String, String>params){

    }
    @Then("daily weather description is:")
    public void daily_weather_description(Map<String, String>params){

    }
    @Then("alert Nr. {int} received:")
    public void check_alert(int index, Map<String, String>params){

    }
    @Then("tags for an alert Nr. {int} are:")
    public void check_tags (int index, List<String> tags){

    }
}
