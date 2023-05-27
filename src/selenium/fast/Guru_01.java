package selenium.fast;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Guru_01 {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "E:\\New folder\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "http://demo.guru99.com/test/newtours/";
		String expectedTitle = "Welcome: Mercury Tours";
		 String actualTitle = "";
		 
		 driver.get(baseUrl);
		 actualTitle =  driver.getTitle();
		 
		 if(actualTitle.contentEquals(expectedTitle)) {
			 System.out.println("Test Passed!");
		 }
		 else {
			 System.out.println("Test failed!");
		 }
		 driver.close();
	     System.exit(0);
	}

}
