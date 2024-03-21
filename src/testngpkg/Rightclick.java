package testngpkg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rightclick {
	
	
	ChromeDriver  driver;  
	String baseurl="https://demo.guru99.com/test/simple_context_menu.html";
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
	}
	
	@Test
	public void rightclickmethod()
	{
		 
		
		WebElement rightclick = driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		WebElement cut=driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[2]/span"));
		Actions act = new Actions(driver);
		act.contextClick(rightclick);
	    act.perform();
	    cut.click();
	    
	    Alert a=driver.switchTo().alert();
		String alerttext=a.getText();
		System.out.println("alerttext="+alerttext);
		a.accept();


		WebElement doubleclick = driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul"));
		act.doubleClick(doubleclick);
		
		act.perform();
		
		   Alert b=driver.switchTo().alert();
			String alerttext1=b.getText();
			System.out.println("alerttext="+alerttext1);
			a.accept();

		
	}  

}
