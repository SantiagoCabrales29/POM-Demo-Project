package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Locale;

public class WindowManager {
    private WebDriver driver;
    private WebDriver.Navigation navigate;
    public WindowManager(WebDriver driver){
        this.driver = driver;
        navigate = driver.navigate();
    }

    public void switchToTab(String name){
        var windows = driver.getWindowHandles();
        for(String window: windows){
            //System.out.println("Entro aca "+driver.getCurrentUrl());
            driver.switchTo().window(window);
            if(driver.getTitle().contains(name)){
                break;
            }
        }
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.urlContains(name.replaceAll("\\s", "").toLowerCase(Locale.ROOT)));

    }
}
