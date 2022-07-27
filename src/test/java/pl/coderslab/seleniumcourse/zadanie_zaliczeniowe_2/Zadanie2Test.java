package pl.coderslab.seleniumcourse.zadanie_zaliczeniowe_2;

import io.cucumber.java.Before;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pl.coderslab.seleniumcourse.cucumber.TestSetup;


import java.io.IOException;
import java.time.Duration;

public class Zadanie2Test extends TestSetup {




    @Test
    public void shouldOrderAndTakeScreenshot() throws IOException {

        driver.get("https://mystore-testlab.coderslab.pl/index.php");
        loginStorePage.loginAsCreatedUser("gdhthtdxtzehqimdxa@bvhrk.com", "Tajnehaslo123");
        searchItemPage.mainPage();
        searchItemPage.chooseItem();
        itemDetailsPage.selectSize("M");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
        itemDetailsPage.setQuantity("5");
        itemDetailsPage.addToCart();
        cartPage.proceedToCheckout();
        addressConfirmPage.confirmAddress();
        paymentPage.paymentChoose();
        printScreenPage.savePrintScreen();
    }
}