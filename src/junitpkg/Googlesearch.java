package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlesearch 
{

	ChromeDriver driver;
	String baseurl="https://www.google.com";
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	
	
	@Test
	public void googlesearch()
	{
		driver.get(baseurl);
		WebElement search=driver.findElement(By.name("q"));
		
		search.sendKeys("messi",Keys.ENTER);
		
		// keys. ENTER OR
		// search.submit();
	
		
		// driver.findElement(By.name(" q ")).sendKeys(" messi ");
		// driver.findElement(By.name("")).click();
	} 
	
	
}
