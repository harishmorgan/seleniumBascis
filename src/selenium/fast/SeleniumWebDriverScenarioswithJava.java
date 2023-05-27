package selenium.fast;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebDriverScenarioswithJava {

	public static void main(String[] args) {

		// WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "E:\\New folder\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "https://www.amazon.in/";
		driver.get(baseUrl);
		List<WebElement> linkLists = driver.findElements(By.tagName("a"));

		System.out.println(linkLists.size());

		// using normal for loop

		for (WebElement links : linkLists) {
			System.out.println("Total number of links:" + links.getText());

		}

		// 1.
		linkLists.stream().forEach(ele -> System.out.println(ele.getText()));

		// 2.

		List<String> collectList = linkLists.stream().filter(ele -> !ele.getText().equals("")).map(ele -> ele.getText())
				.collect(Collectors.toList());

		collectList.forEach(ele -> System.out.println(ele));

		// 3.

		String firstLinks = linkLists.stream().filter(ele -> !ele.getText().equals("")).findFirst().get().getText();
		System.out.println(firstLinks);

		// 4.
		String findAnyLinks = linkLists.stream().filter(ele -> !ele.getText().equals("")).findAny().get().getText();
		System.out.println(findAnyLinks);

		// 5. exclude blank statements and which starts with facebook

		List<String> excludeLinks = linkLists.stream()
				.filter(ele -> !ele.getText().equals("") && ele.getText().startsWith("Amazon"))
				.map(ele -> ele.getText()).collect(Collectors.toList());
		excludeLinks.forEach(ele -> System.out.println(ele));

		// 6

		List<String> AllLinksText = linkLists.stream().filter(ele -> !ele.getText().isEmpty())
				.filter(ele -> !ele.getText().startsWith("")).map(ele -> ele.getText().trim())
				.collect(Collectors.toList());

		AllLinksText.forEach(ele -> System.out.println(ele));

		driver.quit();

	}

}
