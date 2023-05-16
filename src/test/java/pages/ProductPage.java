package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ProductPage extends BasePage {
    @FindBy(id = "pa_color")
    private WebElement colors;
    @FindBy(id = "pa_size")
    private WebElement size;
    @FindBy(className = "qty-increase")
    private WebElement quantityIncrease;
    @FindBy(className = "single_add_to_cart_button")
    private WebElement addToCartButton;

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void addItemToCart(int colorIndex, int sizeIndex) {
        Select colorSelect = new Select(colors);
        colorSelect.selectByIndex(colorIndex);
        Select sizeSelect = new Select(size);
        sizeSelect.selectByIndex(sizeIndex);
        quantityIncrease.click();
        addToCartButton.click();
    }


}
