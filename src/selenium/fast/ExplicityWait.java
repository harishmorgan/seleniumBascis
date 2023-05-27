package selenium.fast;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicityWait {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\New folder\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		String baseUrl = "http://www.facebook.com/"; 
		driver.get(baseUrl);		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//WebElement locator = driver.findElement(By.xpath("//*[@name='pass']"));
		//Wait<WebDriver> wt = new WebDriverWait(driver , 30);
		//wt.until(ExpectedConditions.elementToBeClickable(locator));
		//locator.click();
		clickOn(driver,driver.findElement(By.xpath("//*[@name='pass']")), 30);
		
	}
	public static void clickOn(WebDriver driver, WebElement locator, int timeout) {
		new WebDriverWait(driver , timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();
		
	}

}
