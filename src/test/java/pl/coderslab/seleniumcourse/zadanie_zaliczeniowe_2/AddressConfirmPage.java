package pl.coderslab.seleniumcourse.zadanie_zaliczeniowe_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddressConfirmPage {
    private WebDriver driver;
    public AddressConfirmPage(WebDriver driver) {
        this.driver = driver;
    }

    public void confirmAddress() {
        WebElement continueButton = driver.findElement(By.name("confirm-addresses"));
        continueButton.click();
        WebElement shippingMethod = driver.findElement(By.id("delivery_option_1"));
        shippingMethod.isSelected();
        WebElement confirmDeliveryButton = driver.findElement(By.xpath("//*[@id=\"js-delivery\"]/button"));
        confirmDeliveryButton.click();
    }
}
