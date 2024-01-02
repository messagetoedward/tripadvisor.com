package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class LogIn {
	
	@Test
	public void LogInStart() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/mgid/Downloads/chromedriver-mac-x64/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://tripadvisor.com");
		
	//	System.out.println(driver.getTitle());

		driver.quit();
		
		
		
	}

	
	
}
