package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "p[data-notice-id='1013467fc0b780504faafa9d866c07ac'] a")
    private WebElement dismiss;

    @FindBy(xpath = "//a[text()='My Account']")
    private WebElement myAccount;

    public void goToMyAccount(){
        dismiss.click();
        myAccount.click();
//        driver.get("https://shop.demoqa.com/my-account/");
    }
}
