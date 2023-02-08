package stepdefenitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class WeatherStepDefs {
    @Given("city ID is: {long}")
    public void set_city_id(long id) {

    }

    @When("we are requesting weather forecast")
    public void request_weather(){

    }
    @Then("coordinates are:")
    public void check_coordinates(Map<String, Double> params){

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
