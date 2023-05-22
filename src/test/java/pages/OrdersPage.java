package pages;

import org.openqa.selenium.WebDriver;

public class OrdersPage extends BasePage{
    public OrdersPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void validatePage(String message, String url) {
        super.validatePage(message, url);
    }
}
