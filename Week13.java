

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxOptions;

public class Week13 {
    public static void main(String[] args) {
        
        System.setProperty("webdriver.chrome.driver", "/Users/arun/Documents/chromedriver");
        
     //   FirefoxOptions options = new FirefoxOptions();
             
        // Launch Firefox
     //   WebDriver driver = new FirefoxDriver();
        
        WebDriver driver = new ChromeDriver();

        // Run your test
        driver.get("https://www.facebook.com");
        System.out.println("Title: " + driver.getTitle());

        // Close the browser
        driver.quit();
    }
}
