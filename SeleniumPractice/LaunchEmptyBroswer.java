package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchEmptyBroswer {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		//driver.get("https://navodaya.gov.in/nvs/en/Home1#");
		driver.get("https://navodaya.gov.in/");
		
		
	}

}
