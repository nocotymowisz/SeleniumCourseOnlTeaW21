package pl.coderslab.seleniumcourse.zadanie_zaliczeniowe_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ItemDetailsPage {
    private WebDriver driver;

    public ItemDetailsPage(WebDriver driver) {
        this.driver = driver;
    }
    public void selectSize(String size) {
        WebElement selecttSize = driver.findElement(By.id("group_1"));
        selecttSize.sendKeys(size);

    }

        public void setQuantity(String quantity) {
            WebElement setquantity = driver.findElement(By.id("quantity_wanted"));
                setquantity.clear();
                setquantity.sendKeys(quantity);
            }


    public void addToCart() {
        WebElement addToCart = driver.findElement(By.cssSelector(".btn.btn-primary.add-to-cart"));
        addToCart.click();
    }
}