package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ShopPage extends BasePage {
    @FindBy(css = "div div div div[class='noo-product-inner']")
    private List<WebElement> products;
    @FindBy(xpath = "//a[@data-title='Add to Wishlist']")
    private List<WebElement> wishlistButtons;
    @FindBy(xpath = "//ul//a[text()='My Wishlist']")
//    @FindBy(xpath = "//div[@class='noo-container']//ul//a[text()='My Wishlist']")
    private WebElement myWishlist;

    @FindBy(className = "cart-button")
    private WebElement cart;

    public ShopPage(WebDriver driver) {
        super(driver);
    }

    public void goToCart() {
        cart.click();
//        driver.get("https://shop.demoqa.com/my-account/");
    }

    @Override
    public void validatePage(String message, String url) {
        super.validatePage(message, url);
    }

    public void addProductsToWishlist() {
        Actions actions = new Actions(driver);
        for (int i = 0; i < 3; i++) {
            actions.moveToElement(products.get(i)).perform();
            wishlistButtons.get(i).click();
        }
    }

    public void addProductToCart(int productIndex, int colorIndex, int sizeIndex) {
        Actions actions = new Actions(driver);
//        for (int i = 0; i < 3; i++) {
        actions.moveToElement(products.get(productIndex)).click().perform();
        ProductPage productPage = new ProductPage(driver);
        productPage.addItemToCart(1, 1);
        driver.get("https://shop.demoqa.com/shop/");
//        }
    }

    public void goToWishlist() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].scrollIntoView(true);", myWishlist);
//        myWishlist.click();
    }


}
