package testngpkg;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assertionpgm {
	
	
	
	ChromeDriver driver;
	String baseurl ="https://www.facebook.com";
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void tittleverification()
	{
		String exp="facebook";
		String actualtitle=driver.getTitle();
		
		Assert.assertEquals(actualtitle, exp);
		
		System.out.println("test 1");
	}
	
	
	

}
