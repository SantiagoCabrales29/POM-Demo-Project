package pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    WebDriver driver;

    public HomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
}