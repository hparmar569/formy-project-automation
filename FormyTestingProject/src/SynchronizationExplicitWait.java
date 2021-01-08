import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SynchronizationExplicitWait {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\harmanjit.b.singh\\Documents\\java programs\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/autocomplete");
		WebElement autocomplete=driver.findElement(By.id("autocomplete"));
		autocomplete.sendKeys("444 dugri road urban");
		
		//Thread.sleep(2000);
		
		//Explicit wait is Intelligent and better than Implicit wait
		//Explicit wait is also deprecated
		
		WebDriverWait wait=new WebDriverWait(driver,2);
		
		WebElement first=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div.pac-container.pac-logo.hdpi")));
		first.click();
	
		//there are other expected conditions also which can be used(see documentation of explicit wait)
		//driver.quit();
		
		

	}

}
