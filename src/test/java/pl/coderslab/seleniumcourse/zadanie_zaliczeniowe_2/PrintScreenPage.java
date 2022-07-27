package pl.coderslab.seleniumcourse.zadanie_zaliczeniowe_2;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;

public class PrintScreenPage {
    private WebDriver driver;
    public PrintScreenPage(WebDriver driver) {
        this.driver = driver;
    }

    public void savePrintScreen() throws IOException {

        File tmpScreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String currentDateTime = LocalDateTime.now().toString().replaceAll(":", "_");
        Files.copy(tmpScreenshot.toPath(), Paths.get("C:", "test-evidence", "ddg-search-" + currentDateTime + ".png"));
    }
}

