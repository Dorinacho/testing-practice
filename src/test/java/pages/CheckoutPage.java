package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage{
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@name='terms']")
    private WebElement termsCheckbox;

    @FindBy(id = "place_order")
    private WebElement placeOrder;

    public void acceptTerms(){
        Actions actions = new Actions(driver);
        actions.moveToElement(termsCheckbox).click().perform();
//        termsCheckbox.click();
    }

    public void placeOrder(){
        placeOrder.click();
    }

    @Override
    public void validatePage(String message, String url) {
        super.validatePage(message, url);
    }
}
