package selenium.fast;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksWithStream {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\New folder\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
		
		// List<WebElement> footerList = driver.findElements(By.cssSelector("ul.footer-nav li"));
		
				List<String> newFooterList = new ArrayList<String>();
				driver.findElements(By.cssSelector("div.fw-footer a"))
				.stream()
				.forEach(ele -> newFooterList.add(ele.getText()));
				
//				footerList.stream().forEach(ele -> newFooterList.add(ele.getText()));
				
				newFooterList.forEach(System.out::println);
				

	}

}
