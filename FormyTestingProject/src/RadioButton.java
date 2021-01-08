import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\harmanjit.b.singh\\Documents\\java programs\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/radiobutton");
		
		/*WebElement radioButton1=driver.findElement(By.id("radio-button-1"));
		radioButton1.click();
		Thread.sleep(1000);
		
		WebElement radioButton2=driver.findElement(By.cssSelector("input[value='option2']"));
		radioButton2.click();
		Thread.sleep(1000);
		
		WebElement radioButton3=driver.findElement(By.xpath("/html/body/div/div[3]/input"));
		radioButton3.click();
		Thread.sleep(1000); */
	
		

		List<WebElement> radioButton=driver.findElements(By.name("exampleRadios"));
		int rsize=radioButton.size();
		for(int i=0;i<rsize;i++)
		{
			String rbValue=radioButton.get(i).getAttribute("value");
			if(rbValue.equalsIgnoreCase("option2")==true)
			{
				radioButton.get(i).click();
				break;
			}
		}  
		
		//both above methods are correct
		//driver.quit();
		
		

	}

}
