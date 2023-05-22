package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public WebDriver driver;
    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void validatePage(String message, String expectedUrl){
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(message, expectedUrl, currentUrl);
    }
}
