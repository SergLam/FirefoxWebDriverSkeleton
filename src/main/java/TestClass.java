import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestClass {

    private WebDriver driver;

    @After
    public void quitDriver() {
       // driver.quit();
    }

    @Test
    public void Google() throws Exception {
        System.setProperty("webdriver.gecko.driver", MainClass.getGeckoDriverPath());
        DesiredCapabilities capabilities=DesiredCapabilities.firefox();
        capabilities.setCapability("marionette", true);
        driver= new FirefoxDriver();
        driver.get("https://www.amazon.com/");
    }
}
