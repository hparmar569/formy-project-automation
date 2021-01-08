import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SynchronizationImplicitWait {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\harmanjit.b.singh\\Documents\\java programs\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/autocomplete");
		WebElement autocomplete=driver.findElement(By.id("autocomplete"));
		autocomplete.sendKeys("444 dugri road urban");
		
		//Thread.sleep(2000);
		
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		
		//Implicitly wait is deprecated
		
		WebElement first=driver.findElement(By.cssSelector("body > div.pac-container.pac-logo.hdpi"));
		first.click();
	
		
		//driver.quit();
		
		

	}

}
