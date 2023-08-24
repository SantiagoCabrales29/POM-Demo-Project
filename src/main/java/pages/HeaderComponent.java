package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.WindowManager;

import java.time.Duration;
import java.util.List;

public class HeaderComponent {
    private By logoIcon = By.cssSelector("a[rel='home']");
    private List<WebElement> listOfBrands;
    private List<WebElement> menuButtons;
    private By searchBar = By.id("edit-cludo-search");
    private WebDriver driver;
    private By lupita = By.id("edit-submit");

    public HeaderComponent(WebDriver driver){
        this.driver = driver;
    }

    public void clickABrand(String nameOfBrand){
        System.out.println(driver.getCurrentUrl());
        listOfBrands = driver.findElements(By.cssSelector("a[class*='brand--']"));
        for (WebElement brand: listOfBrands) {
            //System.out.println("Hola " + brand.getAttribute("innerText"));
            if (brand.getAttribute("innerText").equalsIgnoreCase(nameOfBrand)){
                brand.click();
            }
        }
        WindowManager windowManager = new WindowManager(driver);
        windowManager.switchToTab(nameOfBrand);
        System.out.println(driver.getCurrentUrl());
    }

    public ResultsPage searchTerm(String term){
        driver.findElement(searchBar).sendKeys(term);
        driver.findElement(lupita).click();
        ResultsPage resultsPage = new ResultsPage(driver);
        return resultsPage;
    }
}
