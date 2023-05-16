package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OrderReceivedPage extends BasePage{
    public OrderReceivedPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//a[text()='My Account']")
    private WebElement myAccount;

    public void goToMyAccount(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement element = driver.findElement(By.xpath("//a[text()='My Account']"));
//        wait.until(ExpectedConditions.stalenessOf(element));
        element.click();
    }

    @Override
    public void validatePage(String message, String url) {
        super.validatePage(message, url);
    }
}
