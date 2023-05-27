package selenium.fast;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsMove {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\New folder\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		String baseUrl = "http://www.facebook.com/"; 
		driver.get(baseUrl);		
		WebElement textEmail = driver.findElement(By.name("email"));
		Actions builder = new Actions(driver);
		Action seriesOfActions = builder.moveToElement(textEmail)
				.click()
				.keyDown(Keys.SHIFT)
				.sendKeys(textEmail, "hello")
				.keyUp(textEmail, Keys.SHIFT)
				.doubleClick(textEmail).contextClick()
				.build();
				seriesOfActions.perform();
		

	}

}
