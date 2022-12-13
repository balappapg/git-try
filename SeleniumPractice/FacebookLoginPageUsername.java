package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginPageUsername {
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("ATOM");  
//		driver.findElement(By.name("email")).sendKeys("Bharath");
//		driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("Chetan"); // InvalidSelectorException: Compound
//		driver.findElement(By.cssSelector(input[placeholder='Email address or phone number']))
//		dr.sendeys("Darashn");
		Thread.sleep(5000);
		driver.close();
	}
}
