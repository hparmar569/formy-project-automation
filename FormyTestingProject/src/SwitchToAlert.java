import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SwitchToAlert {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\harmanjit.b.singh\\Documents\\java programs\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/switch-window");
		WebElement alertButton=driver.findElement(By.id("alert-button"));
		alertButton.click();
		
		Thread.sleep(2000);
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
		//driver.quit();
		
		

	}

}
