package pages;

import org.openqa.selenium.WebDriver;

public class BasePage {
    private WebDriver driver;
    private HeaderComponent header;
    private FooterComponent footer;

    public BasePage(WebDriver driver){
        this.driver = driver;
        this.header =  new HeaderComponent(driver);
        this.footer = new FooterComponent(driver);
    }

    public HeaderComponent getHeader(){
        return header;
    }

    public String getUrl(){
        return driver.getCurrentUrl();
    }

    public FooterComponent getFooter(){
        return footer;
    }


}
