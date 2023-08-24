package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import pages.HomePage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseTest {

    protected static Properties props;
    private WebDriver driver;
    public HomePage homePage;

    @BeforeTest
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","/Users/sancabra/Documents/Automation/Automation_Projects/Selenium_Java/POM-Demo-Project/resources/geckodriver");
        readProperties();
        driver = new FirefoxDriver();
        driver.get(props.getProperty("url"));
        homePage = new HomePage(driver);

    }

    public void readProperties() {
        props = new Properties();
        try {
            props.load(new FileInputStream("application.properties"));
        } catch (IOException var2) {
            System.out.println("Hay un error leyendo el archivo de properties");
        }
    }

    @Test
    public void firstTest(){
        driver.get(props.getProperty("url"));
    }

//	@AfterTest
//	public void tearDown(){
//		driver.quit();
//	}

}
