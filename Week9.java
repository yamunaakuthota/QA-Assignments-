

		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class validate_pagetitle {

		    public static void main(String[] args) {
		       
		    	System.setProperty("webdriver.chrome.driver", "/Users/arun/Documents/chromedriver");

		        WebDriver driver = new ChromeDriver();

		        try {
		            driver.get("https://www.facebook.com/");

		            String expectedTitle = "Facebook - log in or sign up";
		            String actualTitle = driver.getTitle();
		//          System.out.println("expectedtitle"+ actualtile);


		            // Assertion
		            assert actualTitle.equals(expectedTitle) : 
		                "Assertion Failed: Expected '" + expectedTitle + "', but got '" + actualTitle + "'";

		            System.out.println("Test Passed: Page title is correct.");

		        } finally {
		            driver.quit();
		        }
             }
          }
