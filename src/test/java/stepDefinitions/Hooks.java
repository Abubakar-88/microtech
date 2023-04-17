package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    private WebDriver driver;

    /**
     * 
     */
    @Before
public void setup() throws MalformedURLException, InterruptedException {
//     System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
//     ChromeOptions options = new ChromeOptions();
//     options.addArguments("--remote-allow-any-origin");
    ChromeOptions opt = new ChromeOptions();
		
	WebDriver driver = new RemoteWebDriver(new URL("http://3.145.197.131:4444"),opt);
    
//     options.addArguments("--start-maximized");
//     options.addArguments("--headless");
//     options.addArguments("--no-sandbox");
//     options.addArguments("--disable-gpu");
//     options.addArguments("--disable-dev-shm-usage");
//     options.addArguments("--remote-debugging-port=9222");
//     options.addArguments("--remote-debugging-address=0.0.0.0");
  //  driver = new ChromeDriver(options);
}
    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit(); 
        }
    }
}

