package selenium.fast;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Images {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\New folder\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.guru99.com/click-on-image-in-selenium.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("a[rel='home']")).click();
		if (driver.getTitle().equals("Meet Guru99 – Free Training Tutorials & Video for IT Courses")) {							
            System.out.println(" we are in Meet Guru99 – Free Training Tutorials & Video for IT Courses");					
        } else {			
            System.out.println("We are NOT in Meet Guru99 – Free Training Tutorials & Video for IT Courses");					
        }		
				driver.close();		


	}

}
