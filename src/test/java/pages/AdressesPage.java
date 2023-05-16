package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdressesPage extends BasePage{
    public AdressesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@href='https://shop.demoqa.com/my-account/edit-address/billing/']")
    private WebElement addBillingAddress;

    @FindBy(xpath = "//a[@href='https://shop.demoqa.com/my-account/edit-address/shipping/']")
    private WebElement addShippingAddress;

    public void goToBillingForm(){
        addBillingAddress.click();
    }

    public void goToShippingForm(){
        addShippingAddress.click();
    }

    @Override
    public void validatePage(String message, String url) {
        super.validatePage(message, url);
    }

//    public void validatePage(){
//        String pageURL = driver.getCurrentUrl();
//        String expectedURL = ;
//        Assert.assertEquals("The url is not correct!", expectedURL, pageURL);
//    }
}
