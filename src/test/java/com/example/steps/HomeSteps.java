package com.example.steps;

import com.example.BaseTest;
import com.example.page.homePage;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HomeSteps extends BaseTest {

    @Then("user will redirect to homepage")
    public void userWillRedirectToHomepage() {
        homePage HomePage = new homePage(driver);
        HomePage.userWillRedirectToHomepage();


    }
}
