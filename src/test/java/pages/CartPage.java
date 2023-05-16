package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CartPage extends BasePage{
    public CartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//tbody//tr[@class='cart_item']")
    private List<WebElement> cartItems;

    @FindBy(xpath = "//div[@class='wc-proceed-to-checkout']//a")
    private WebElement checkout;

    public void checkCartItems(){
        Assert.assertEquals("Something is wrong with the cart items", 3, cartItems.size());
    }

    public void goToCheckout(){
        checkout.click();
    }

    @Override
    public void validatePage(String message, String url) {
        super.validatePage(message, url);
    }
}
