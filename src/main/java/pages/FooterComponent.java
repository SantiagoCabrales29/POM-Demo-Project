package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FooterComponent {
    WebDriver driver;
    public By contactButton = By.cssSelector("a[href*='contact-form']");

    public FooterComponent(WebDriver driver) {
        this.driver = driver;
    }

    public void clickContactForm(){
        driver.findElement(contactButton).click();
        //return new ContactPage(driver);

    }
}
