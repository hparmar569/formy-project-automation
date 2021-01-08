import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DropDownButton {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\harmanjit.b.singh\\Documents\\java programs\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/dropdown");
		
		WebElement dropDownMenu=driver.findElement(By.id("dropdownMenuButton"));
		dropDownMenu.click();
		
		Thread.sleep(1000);
		WebElement autoCompleteItem=driver.findElement(By.id("autocomplete"));
		autoCompleteItem.click();

		//driver.quit();

	}

}
