import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;

import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FileUpload {
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\harmanjit.b.singh\\Documents\\java programs\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/fileupload");
		
		/*WebElement file=driver.findElement(By.id("file-upload-field"));
		file.sendKeys("butterfly.jpg"); */
		
		Thread.sleep(1000);
		
		StringSelection filePath=new StringSelection("C:\\Users\\harmanjit.b.singh\\Documents\\java programs\\FormyTestingProject\\src\\butterfly.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath, null);
		driver.findElement(By.id("file-upload-field")).click();
		
		
		Thread.sleep(2000);
		Robot r=new Robot();  //we can use any keyboard actions using Robot class
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);  //every key which is pressed is to be released
		
		
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER); 

		
		//Both ways are correct
		//driver.quit();

	}

}
