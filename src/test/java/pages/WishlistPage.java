package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class WishlistPage extends BasePage {
    @FindBy(css = "tbody tr")
    private List<WebElement> removeButtons;

    public WishlistPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void validatePage(String message, String url) {
        super.validatePage(message, url);
    }

    public void checkWishlistItems() {
        Assert.assertEquals("The number of wishlist items are wrong", 3, removeButtons.size());

        // am incercat cumva sa sterg elementele din wishlist

//        for (WebElement removeButton : removeButtons) {
//            removeButton.click();
//        }
//        List<WebElement> buttons1 = driver.findElements(By.cssSelector("tbody td[class='product-remove'] div a"));
//        buttons1.get(0).click();
//        List<WebElement> buttons2 = driver.findElements(By.cssSelector("tbody td[class='product-remove'] div a"));
//        buttons2.get(0).click();
//        List<WebElement> buttons3 = driver.findElements(By.cssSelector("tbody td[class='product-remove'] div a"));
//        buttons3.get(0).click();
    }
}
