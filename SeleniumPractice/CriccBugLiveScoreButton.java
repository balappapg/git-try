package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CriccBugLiveScoreButton {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.cricbuzz.com/");
		driver.findElement(By.className("cb-hm-mnu-itm")).click();
		Thread.sleep(5000);
		driver.quit();
	}
}
