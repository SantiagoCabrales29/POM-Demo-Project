package pages;

import org.openqa.selenium.WebDriver;

public class ContactPage extends BasePage{
    WebDriver driver;

    public ContactPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
}
