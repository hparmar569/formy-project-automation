import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SwitchActiveWindow {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\harmanjit.b.singh\\Documents\\java programs\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/switch-window");
		WebElement newTabButton=driver.findElement(By.id("new-tab-button"));
		newTabButton.click();
		
		String origHandle=driver.getWindowHandle();
		//System.out.println(origHandle);
		
		for(String handle:driver.getWindowHandles())
		{
			//System.out.println(handle);
			driver.switchTo().window(handle);
		}
		
		driver.switchTo().window(origHandle);
		
		String title=driver.getTitle();
		System.out.println(title);
		
		//driver.quit();
		
		

	}

}
