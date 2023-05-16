package webDriver;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ShareData {
    public WebDriver webDriver;

    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get("https://shop.demoqa.com/");
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
}
