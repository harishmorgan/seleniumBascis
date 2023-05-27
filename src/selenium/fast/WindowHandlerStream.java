package selenium.fast;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlerStream {
	
	public static String switchToWindowTest(WebDriver driver, String title){
		
		return	driver.getWindowHandles()
						.stream()
							.map(handler -> driver.switchTo().window(handler).getTitle())
								.filter(ele -> ele.contains(title))
								.findFirst()
									.orElseThrow(() -> {
											throw new RuntimeException("No Such window");
									});
			
			
		}

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\New folder\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://deliver.courseavenue.com/PopupTest.aspx");
		driver.findElement(By.name("ctl00$ContentMain$popupTest")).click();
		
		String title = switchToWindowTest(driver, "Google");
		System.out.println(title);
		
		driver.quit();

	}

}
