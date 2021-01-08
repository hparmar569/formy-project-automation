import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScrollPage {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\harmanjit.b.singh\\Documents\\java programs\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/scroll");
		WebElement name=driver.findElement(By.id("name"));
		Actions action =new Actions(driver);
		action.moveToElement(name);
		name.sendKeys("Rihaan Parmar");
		
		driver.findElement(By.id("date")).sendKeys("01/03/2021");;
	
		
		//driver.quit();
		
		

	}

}
