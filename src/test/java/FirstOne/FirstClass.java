package FirstOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class FirstClass {
	static
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selinium\\SeleniumTool\\driver\\chromedriver.exe");
	}
	@Test
	public static void method() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println(driver.getWindowHandle());
		driver.close();
		

	}

}
