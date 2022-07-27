package pl.coderslab.seleniumcourse.zadanie_zaliczeniowe_2;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static pl.coderslab.seleniumcourse.Tools.fillInput;

public class LoginStorePage extends BasePage {
    public LoginStorePage(WebDriver driver) {
        super(driver);
    }
//    private WebDriver driver;

//    public LoginStorePage(WebDriver driver) {
//
//        this.driver = driver;
//    }




    public void loginAsCreatedUser(String email, String password) {

            WebElement signInIcon = driver.findElement(By.xpath("//*[contains(text(),\"Sign in\")]"));
            signInIcon.click();
            WebElement emailInput = driver.findElement(By.name("email"));
            fillInput(emailInput, email);
            WebElement passwordInput = driver.findElement(By.name("password"));
            fillInput(passwordInput, password);
            WebElement signInButton = driver.findElement(By.id("submit-login"));
            signInButton.click();
    }
}