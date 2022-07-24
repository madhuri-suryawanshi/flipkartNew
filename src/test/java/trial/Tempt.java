package trial;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tempt 
{	
	public static void main(String[] args) throws InterruptedException
	{
	//Launch Browser
	System.setProperty("webdriver.chrome.driver","C:\\Users\\mahim\\Desktop\\Madhuri\\AUTOMATION TASKBAR\\SELENIUM\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	//Open Application
	driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
	//Cancle login page
	driver.findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z']")).click();
	
	Thread.sleep(5000);
	//Navigate on login button
	Actions act=new Actions(driver);
	WebElement a=driver.findElement(By.xpath("//*[@class='_1_3w1N']"));
	act.moveToElement(a).build().perform();
	
	//CLick on My Profile
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[text()='My Profile']")).click();
	Thread.sleep(3000);
	//Enter UserName
	driver.findElement(By.xpath("//*[@class='_2IX_2- VJZDxU']")).sendKeys("8149221168");
	Thread.sleep(3000);
	//Enter Password
	driver.findElement(By.xpath("//*[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("madhuri123");
	
	//CLick on login Button
	driver.findElement(By.xpath("(//*[text()='Login'])[3]")).click();
	}
}
