import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CompleteFormElements
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\harmanjit.b.singh\\Documents\\java programs\\chromedriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/form");
		
		submitForm(driver);
		
		waitAlert(driver);
		
		driver.quit();
	}
	
	public static void submitForm(WebDriver driver) throws InterruptedException
	{
		driver.findElement(By.id("first-name")).sendKeys("Viren");
		
		driver.findElement(By.id("last-name")).sendKeys("Paul");
		
		driver.findElement(By.id("job-title")).sendKeys("Ase");
		
		driver.findElement(By.id("radio-button-1")).click();
		
		driver.findElement(By.id("checkbox-1")).click();
		
		Thread.sleep(1000);
		Select dropdown=new Select(driver.findElement(By.id("select-menu")));
		dropdown.selectByValue("1");
		
		driver.findElement(By.id("datepicker")).sendKeys("01/06/2020");
		driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@class='btn btn-lg btn-primary']")).click();
		
	}
	
	public static void waitAlert(WebDriver driver)
	{

		@SuppressWarnings("deprecation")
		WebDriverWait wait=new WebDriverWait(driver,10);
		
		WebElement alertMsg=wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("alert")));
		String actualText=alertMsg.getText();
		
		System.out.println("Alert message is:"+actualText);
		
		assertEquals("The form was successfully submitted!",actualText);
		
	}

}
