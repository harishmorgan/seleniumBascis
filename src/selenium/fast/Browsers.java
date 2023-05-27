package selenium.fast;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browsers {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\New folder\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://html.com/input-type-file/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.findElement(By.xpath("//*[@name='fileupload']")).sendKeys("E:\\NaveenExceldatadriven.xls");
		driver.quit();

	}

}
