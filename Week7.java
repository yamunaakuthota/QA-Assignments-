
	
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


		public class Week7{
			public static void main(String[] args) {
		        System.setProperty("webdriver.chrome.driver", "/Users/arun/Documents/chromedriver");

		        // Launch Chrome browser
		        WebDriver driver = new ChromeDriver();

		        driver.get("https://www.facebook.com");  
		        
		        // Locate button by ID
		        WebElement inputById = driver.findElement(By.id("email"));
		        System.out.println("Text by ID: " + inputById.getAttribute("placeholder"));
		        
		        // Locate button by Name
		        WebElement inputByName = driver.findElement(By.name("email"));
		        System.out.println("Text by Name: " + inputByName.getAttribute("placeholder"));

		        // Locate button by XPath
		        WebElement inputByXPath = driver.findElement(By.xpath("//input[@id='email']"));
		        System.out.println("Text by XPath: " + inputByXPath.getAttribute("placeholder"));
		        
		        driver.quit();       
	}
}
