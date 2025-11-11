

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Week27 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/arun/Documents/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts"); // A demo alert page

        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();

        // Switch to alert
        Alert alert = driver.switchTo().alert();

      //  System.out.println("Alert says: " + alert.getText());

        alert.accept();

        driver.quit();
    }
}
