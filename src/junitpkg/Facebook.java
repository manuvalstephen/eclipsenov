package junitpkg;



import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	
	
	ChromeDriver driver;
	String baseurl="https://www.facebook.com";
	
	@Before
	public void setup()
	{
		driver= new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void fblogin()
	{
		driver.findElement(By.id("email")).sendKeys("abcd@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("efghi");
		driver.findElement(By.name("login")).click();
	}
   
	@After
	public void teartown()
	{
		driver.quit();
	}
	
}
