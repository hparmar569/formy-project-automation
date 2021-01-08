import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class KeyAndMousePress {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\harmanjit.b.singh\\Documents\\java programs\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/keypress");
		WebElement name=driver.findElement(By.id("name"));
		name.click();
		name.sendKeys("Rihaan Parmar");
		
		WebElement button=driver.findElement(By.id("button"));
		button.click();
		
		//driver.quit();
		
		

	}

}
