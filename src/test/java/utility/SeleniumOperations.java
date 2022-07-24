
package utility;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumOperations
{
	public static ChromeDriver driver;
	public static Hashtable<String,Object> outputparameters=new Hashtable<String,Object>();
	
	public static Hashtable<String,Object> browserLaunch(Object[]inputParameters)
	{
		try
		{
		String strBrowserName=(String)inputParameters[0];
		String strExe=(String)inputParameters[1];
		
	System.setProperty(strBrowserName,strExe);
	 driver=new ChromeDriver();
	driver.manage().window().maximize();	
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		outputparameters.put("STATUS", "PASS");
		outputparameters.put("MESSAGE", "Methodused:BrowserLaunch,Input Given:"+inputParameters[1].toString());
		}
				
				catch(Exception e)
		{
					outputparameters.put("STATUS", "FAIL");
					outputparameters.put("MESSAGE", "Methodused:BrowserLaunch,Input Given:"+inputParameters[1].toString());
		}
		return outputparameters;
	}
	
	public static Hashtable<String,Object> openApplication(Object[]inputParameters)
	{
		try
		{
		String path=(String)inputParameters[0];
		driver.get(path);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		outputparameters.put("STATUS", "PASS");
		outputparameters.put("MESSAGE", "Methodused:OpenApplication,Input Given:"+inputParameters[0].toString());
		}
		catch(Exception e)
		{
			outputparameters.put("STATUS", "FAIL");
			outputparameters.put("MESSAGE", "Methodused:OpenApplication,Input Given:"+inputParameters[0].toString());
		}
		return outputparameters;
	}
	
	public static Hashtable<String,Object> clickOnElement(Object[]inputParameters)
	{
		try
		{
		String xpath=(String)inputParameters[0];
		driver.findElement(By.xpath(xpath)).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		outputparameters.put("STATUS", "PASS");
		outputparameters.put("MESSAGE", "Methodused:clickOnElement,Input Given:"+inputParameters[0].toString());
		}
		catch(Exception e)
		{
			outputparameters.put("STATUS", "FAIL");
			outputparameters.put("MESSAGE", "Methodused:clickOnElement,Input Given:"+inputParameters[0].toString());
		}
		return outputparameters;
	}
	
	public static Hashtable<String,Object> moveToElement(Object[]inputParameters)
	{
		try
		{
		String xpath=(String)inputParameters[0];
		Actions act=new Actions(driver);
		WebElement a=driver.findElement(By.xpath(xpath));
		act.moveToElement(a).build().perform();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		outputparameters.put("STATUS", "PASS");
		outputparameters.put("MESSAGE", "Methodused:moveToElement,Input Given:"+inputParameters[0].toString());
		}
		catch(Exception e)
		{
			outputparameters.put("STATUS", "FAIL");
			outputparameters.put("MESSAGE", "Methodused:moveToElement,Input Given:"+inputParameters[0].toString());
		}
		return outputparameters;
	}
	
	public static Hashtable<String,Object> sendText(Object[]inputParameters)
	{
		try
		{
		String path=(String)inputParameters[0];
		String text=(String)inputParameters[1];
		driver.findElement(By.xpath(path)).sendKeys(text);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		outputparameters.put("STATUS", "PASS");
		outputparameters.put("MESSAGE", "Methodused:sendText,Input Given:"+inputParameters[1].toString());
		}
		catch(Exception e)
		{
			outputparameters.put("STATUS", "FAIL");
			outputparameters.put("MESSAGE", "Methodused:sendText,Input Given:"+inputParameters[1].toString());
		}
		return outputparameters;
	}
	
	public static Hashtable<String,Object> validationByGetText(Object[]inputParameters)
	{
		try
		{
			String giventext=(String)inputParameters[0];
			String locator=(String)inputParameters[1];
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			String capturedtext=driver.findElement(By.xpath(locator)).getText();
			if(giventext.equalsIgnoreCase(capturedtext))
			{
				System.out.println("Test caes passed");
			}
			else
			{
				System.out.println("Test case failed");	
			}
			outputparameters.put("STATUS", "PASS");
			outputparameters.put("MESSAGE", "Methodused:validationByGetText,Input Given:"+inputParameters[1].toString());
		}
		catch(Exception e)
		{
			outputparameters.put("STATUS", "FAIL");
			outputparameters.put("MESSAGE", "Methodused:validationByGetText,Input Given:"+inputParameters[1].toString());
		}	
		
		return outputparameters;
	}
public static void main(String[] args) throws InterruptedException
{
	//BROWSERlaunch
	Object[] input1=new Object[2];
	input1[0]="webdriver.chrome.driver";
	input1[1]="C:\\Users\\mahim\\Desktop\\Madhuri\\AUTOMATION TASKBAR\\SELENIUM\\chromedriver.exe";
	SeleniumOperations.browserLaunch(input1);

	Object[] input2=new Object[1];
	input2[0]="https://www.flipkart.com/";
	SeleniumOperations.openApplication(input2);
	
	Thread.sleep(5000);
	Object[] input3=new Object[1];
	input3[0]="//*[@class='_2KpZ6l _2doB4z']";
	SeleniumOperations.clickOnElement(input3);
	
	Object[] input4=new Object[1];
	input4[0]="//*[@class='_1_3w1N']";
	SeleniumOperations.moveToElement(input4);
	
	Object[] input5=new Object[1];
	input5[0]="//*[text()='My Profile']";
	SeleniumOperations.clickOnElement(input5);
	
	Thread.sleep(5000);
	Object[] input6=new Object[2];
	input6[0]="//*[@class='_2IX_2- VJZDxU']";
	input6[1]="8149221168";
	SeleniumOperations.sendText(input6);
	
	Object[] input7=new Object[2];
	input7[0]="//*[@class='_2IX_2- _3mctLh VJZDxU']";
	input7[1]="madhuri123";
	SeleniumOperations.sendText(input7);
	
	Object[] input8=new Object[1];
	input8[0]="(//*[text()='Login'])[3]";
	SeleniumOperations.clickOnElement(input8);
	
	
	Object[] input9=new Object[2];
	input9[0]="Hello";
	input9[1]="//*[text()='Hello']";
	SeleniumOperations.validationByGetText(input9);
	
}
}


