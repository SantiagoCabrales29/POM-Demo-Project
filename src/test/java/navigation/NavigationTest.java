package navigation;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ContactPage;
import pages.ResultsPage;

import java.util.Locale;

public class NavigationTest extends BaseTest {

    @Test
    public void navigateToBrandPage(){
        String brand = "Cannon";
        homePage.getHeader().clickABrand(brand);
        Assert.assertTrue(homePage.getUrl().contains(brand.replaceAll("\\s", "").toLowerCase(Locale.ROOT)));
    }

    @Test
    public void searchTerm(){
        String term = "hoodie";
        ResultsPage results = homePage.getHeader().searchTerm(term);
        Assert.assertTrue(results.getResultLabelText().contains(term));
    }

    @Test
    public void navigateToContactPage(){
        ContactPage contactPage = homePage.getFooter().clickContactForm();
        Assert.assertTrue(contactPage.getUrl().contains("contact"));
    }

}
