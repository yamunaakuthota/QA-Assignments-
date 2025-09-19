

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Week6 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();  

        try {
            driver.get("https://www.google.com");  

            String pageTitle = driver.getTitle();  
            if (pageTitle.contains("Google")) {
                System.out.println("Test Passed: Google homepage loaded.");
            } else {
                System.out.println("Test Failed: Unexpected page title - " + pageTitle);
            }

            } catch (Exception e){
            System.out.println("Test Failed: Exception occurred - " + e.getMessage());
        } finally {
            driver.quit();         
            }
        
	}

}
