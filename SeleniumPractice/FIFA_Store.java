package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FIFA_Store {
	public static void main(String[] args) {
		
		 WebDriver driver= new ChromeDriver();
		 driver.get("https://www.fifa.com/fifaplus/");
		 driver.findElement(By.className("global-menu-nav-strip_link__label__32bog")).click();
		 driver.quit();
	}
}
