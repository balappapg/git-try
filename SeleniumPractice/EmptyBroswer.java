 package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmptyBroswer {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		Thread.sleep(5000);
		//driver.get("https://www.youtube.com/");
		Thread.sleep(5000);
		driver.quit();
		
		
	}
}
   