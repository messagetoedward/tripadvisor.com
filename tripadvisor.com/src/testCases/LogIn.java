package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LogIn {
	
	@Test
	public void LogInStart() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/mgid/Downloads/chromedriver-mac-x64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://hotels.com");
		
		System.out.println(driver.getTitle());
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement signinButton = driver.findElement(By.xpath("//*[@id='app-layer-base']/div[1]/div[1]/header/div/section/div/div/div[2]/div[2]/button"));
		//WebElement signinPopup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='gc-custom-header-nav-bar-acct-menu']/div")));
		WebElement signinPopup = driver.findElement(By.xpath("//*[@id='app-layer-base']/div[1]/div[1]/header/div/section/div/div/div[2]/div[2]/div"));
		WebElement signinPopupButton = driver.findElement(By.xpath("//*[@id='app-layer-base']/div[1]/div[1]/header/div/section/div/div/div[2]/div[2]/div/div/div/div[3]/a"));
		
		System.out.println(signinPopup.getAttribute("aria-hidden"));
		
		if ("false".equals(signinPopup.getAttribute("aria-hidden"))) {
			System.out.println("Popup was there - " + signinPopupButton.getText());
		} else {
			signinButton.click();
			System.out.println("signin button was clicked");

		}		
			
	}

	
	
}
