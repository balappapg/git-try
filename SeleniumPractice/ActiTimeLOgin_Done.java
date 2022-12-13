package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLOgin_Done {
	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/");
	driver.findElement(By.id("username")).sendKeys("trainee");
	Thread.sleep(1000);
	driver.findElement(By.name("pwd")).sendKeys("trainee");
	Thread.sleep(1000);
	driver.findElement(By.name("remember")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("loginButton")).click();
	Thread.sleep(10000);
	driver.quit();
	
	}
}
