package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ResultsPage extends BasePage{

    WebDriver driver;
    public By pageTitle = By.tagName("h1");
    public By searchResultLabel = By.className("search-result-count");

    public ResultsPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(pageTitle)));
    }

    public String getResultLabelText(){
        return driver.findElement(searchResultLabel).getText();
    }
}
