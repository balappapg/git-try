package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyActitimeLoginPage_01 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/");
		
		String expectedLogInPageTiitle="actiTIME - Login";
		
		System.out.println("Expected LogIn Page Title: "+ expectedLogInPageTiitle);
		
		String actualLoginPageTitle = driver.getTitle();
		 
		System.out.println("Actual Login Page Title: "+actualLoginPageTitle);
		
		String expectedLogInPageUrl="https://demo.actitime.com/login.do";
		
		System.out.println("Expcted Login Page URL: "+ expectedLogInPageUrl);
		
		String actualLoginPageUrl=driver.getCurrentUrl();
		
		System.out.println("Actual Login Page Url:"+actualLoginPageUrl);
		
		System.out.println("Hash Code expectedLogInPageTiitle : "+ expectedLogInPageTiitle.hashCode());
		System.out.println("Hash Code actualLoginPageTitle : "+ actualLoginPageTitle.hashCode());
		
		System.out.println("-------------------------------------------------------------------");
		
		System.out.println(actualLoginPageTitle.length());
		System.out.println(expectedLogInPageTiitle.length());
		if (actualLoginPageTitle==expectedLogInPageTiitle)
		{
			if(actualLoginPageUrl==expectedLogInPageUrl)
			{
				System.out.println("Passed: Both Title and Url are matching ");
			}
			else
				System.out.println("Failed: Url is not matching but tiltle is maching");
			
		}
		else
			System.out.println("Failed: Title is not matching");
		
		
		System.out.println("--------------------------------------------------------------------");
		
		
		if (actualLoginPageTitle.equals(expectedLogInPageTiitle))
		{
			if(actualLoginPageUrl.equals(expectedLogInPageUrl))
			{
				System.out.println("Passed: Both Title and Url are matching ");
			}
			else
				System.out.println("Failed: Tiltle is maching, But Url is not matching");
			
		}
		else
			System.out.println("Failed: Title is not matching");
		
		
		System.out.println("-------------------------------------------------------------------------");
		
		driver.quit();
	}
}
