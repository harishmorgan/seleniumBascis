package selenium.fast;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\New folder\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		String baseUrl = "http://www.facebook.com/"; 
		driver.get(baseUrl);		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Date dt = new Date();
		System.out.println(dt);
		SimpleDateFormat df = new SimpleDateFormat("dd_MM_YYYY_hh_mm_ss");
		System.out.println(df.format(dt));
		FileHandler.copy(screenshotFile, new File("E:\\New folder\\7.00 pm Apr 21" + df.format(dt) +"facebook.png"));
		
	
	}

}
