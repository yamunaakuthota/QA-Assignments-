
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.support.ui.ExpectedConditions;
		import org.openqa.selenium.support.ui.WebDriverWait;

		import java.time.Duration;

		public class Week8 {
		    public static void main(String[] args) {
		       
		        System.setProperty("webdriver.chrome.driver", "/Users/arun/Documents/chromedriver");
                WebDriver driver = new ChromeDriver();

		        try {
		            
		        	driver.get("https://www.facebook.com");
		            
		        	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		            
		            WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
		            
		            searchBox.sendKeys("Selenium WebDriver");

		        } catch (Exception e) {
		            e.printStackTrace();
		        } finally {
		           
		           // driver.quit();
		        }
		    }
		}

		
	      
        

