package stepdefenitions;

import io.cucumber.java.en.When;

public class FirstStepDefs {
    //anotacii pervoe
    @When("we are printing welcome text")
    //metod
    public void print_welcome_text() {
        System.out.println("Hey, all good :)");
    }
}
