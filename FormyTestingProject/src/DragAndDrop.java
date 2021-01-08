import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\harmanjit.b.singh\\Documents\\java programs\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/dragdrop");
		WebElement image=driver.findElement(By.id("image"));
		
		WebElement dropBox=driver.findElement(By.id("box"));
		
		Actions action=new Actions(driver);
		action.dragAndDrop(image,dropBox).build().perform();
		
		
		//driver.quit();
		
		

	}

}
