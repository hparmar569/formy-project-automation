import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\harmanjit.b.singh\\Documents\\java programs\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/checkbox");
		
		WebElement checkBox1=driver.findElement(By.id("checkbox-1"));
		checkBox1.click();
		Thread.sleep(1000);
		
		WebElement checkBox2=driver.findElement(By.id("checkbox-2"));
		checkBox2.click();
		Thread.sleep(1000);
		
		WebElement checkBox3=driver.findElement(By.id("checkbox-3"));
		checkBox3.click();
		Thread.sleep(1000); 
	
		

		/*List<WebElement> checkBox=driver.findElements(By.className("input-group"));
		int csize=checkBox.size();
		for(int i=0;i<csize;i++)
		{
			String cbValue=checkBox.get(i).getAttribute("value");
			if(cbValue.equalsIgnoreCase("checkbox-1")==true || cbValue.equalsIgnoreCase("checkbox-2")==true)
			{
				checkBox.get(i).click();
			}
		}  */
		
		//both above methods are correct
		//driver.quit();
		
		

	}

}
