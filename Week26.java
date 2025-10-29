
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Week26 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/arun/Documents/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        //️CSS Selector by ID
        WebElement email = driver.findElement(By.cssSelector("#email"));
        System.out.println("Email Placeholder: " + email.getAttribute("placeholder"));
        //CSS Selector by Attribute
        WebElement password = driver.findElement(By.cssSelector("input[name='pass']"));
        System.out.println("Password Field Type: " + password.getAttribute("type"));
        //CSS Selector by Class/Attribute
        WebElement loginButton = driver.findElement(By.cssSelector("button[name='login']"));
        System.out.println("Login Button Text: " + loginButton.getText());
        driver.quit();
    }
}
