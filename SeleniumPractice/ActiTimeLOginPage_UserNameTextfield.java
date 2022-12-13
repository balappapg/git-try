package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLOginPage_UserNameTextfield {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/");
	driver.findElement(By.id("username")).sendKeys("UserNameIdentified_Using_ID");
	Thread.sleep(5000);
	driver.findElement(By.name("username")).sendKeys("UserNameIdentified_Using_Name");
	Thread.sleep(5000);
	driver.quit();
}
}
