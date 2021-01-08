import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\harmanjit.b.singh\\Documents\\java programs\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/datepicker");
		
		WebElement dateField=driver.findElement(By.id("datepicker"));
	    dateField.sendKeys("01/01/2021");
		Thread.sleep(1000);
		
		dateField.sendKeys(Keys.RETURN); //to close datepicker

		//driver.quit();
		
		

	}

}
