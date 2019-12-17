package com.vytrack.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginStepDefinitions {

    @Given("user is on the landing page")
    public void user_is_on_the_login_page() {
        System.out.println("I am on the login page");
    }

    @Then("user logs in as a store manager")
    public void user_logs_in_as_store_manager() {
        System.out.println("Login as store manager");

    }
    //any string in "word" will become a parameter for step definition method
    //  And user verifies that "Dashboard" page subtitle is displayed
    @Then("user verifies that {string} page subtitle is displayed")
    public void user_verifies_that_page_subtitle_is_displayed(String string) {
        System.out.println("Verifying page subtitle: " + string);
    }
    @Then("user logs in as a driver")
    public void user_logs_in_as_a_driver() {
        System.out.println("Login as a driver");
    }

    @Then("user logs in as a sales manager")
    public void user_logs_in_as_a_sales_manager() {
        System.out.println("Login as a sales manager");
    }

    @Then("user logs in as an Aibek")
    public void user_logs_in_as_an_Aibek() {
        System.out.println("Welcome Abeke");
    }

}