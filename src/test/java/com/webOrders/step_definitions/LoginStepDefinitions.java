package com.webOrders.step_definitions;

import com.webOrders.pages.LoginPage;


import com.webOrders.utilities.ConfigurationReader;
import com.webOrders.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class LoginStepDefinitions {
    LoginPage loginPage=new LoginPage();

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        Driver.get().get(ConfigurationReader.getProperty("url"));
    }

    @Then("I login as tester")
    public void i_login_as_tester() {
        loginPage.login();
    }

    @Then("I verify that {string} logo is displayed")
    public void i_verify_that_logo_is_displayed(String string) {
        Assert.assertEquals("Logo test is not correct", string, loginPage.getPageLogoText());
   //String expected result coming from feature file/loginPage.getPageLogoText()==>actual result coming from WebElement

    }






}
