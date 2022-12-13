package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CowinSearchButton {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cowin.gov.in");
//		driver.findElement(By.className("searchBtn pin-search-btn district-search accessibility-plugin-ac")).click();
//		ElementClickInterceptedException
		JavascriptExecutor  jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollTo(0,1000)");
		Thread.sleep(500);   // Giving time for broswer to scroll down
//		class="searchBtn pin-search-btn district-search accessibility-plugin-ac"
		WebElement sch = driver.findElement(By.cssSelector("button[class='searchBtn pin-search-btn district-search accessibility-plugin-ac']"));
		sch.click();
		Thread.sleep(5000);
		driver.quit();	
	}
}

