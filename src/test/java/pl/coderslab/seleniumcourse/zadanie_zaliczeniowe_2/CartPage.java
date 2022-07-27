package pl.coderslab.seleniumcourse.zadanie_zaliczeniowe_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
    private WebDriver driver;
    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void proceedToCheckout() {
        WebElement proceedButton = driver.findElement(By.xpath("//a[contains(text(),\"Proceed to checkout\")]"));
        proceedButton.click();
        WebElement ptoceedToCheckoutButton = driver.findElement(By.xpath("//a[contains(text(),\"Proceed to checkout\")]"));
        ptoceedToCheckoutButton.click();
    }
}
