package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FooterComponent {
    WebDriver driver;
    public By contactButton = By.cssSelector("a[href*='contact-form']");

    public FooterComponent(WebDriver driver) {
        this.driver = driver;
    }

    public ContactPage clickContactForm(){
        scrollIntoFooter();
        driver.findElement(contactButton).click();
        return new ContactPage(driver);

    }

    public void scrollIntoFooter(){
        String script = "window.scrollTo(0, document.body.scrollHeight)";
        ((JavascriptExecutor)driver).executeScript(script);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(contactButton)));

        driver.manage().window().maximize();
    }
}
