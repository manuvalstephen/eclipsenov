package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.Fblogincreate;
import pagepkg.Fbloginpage;

public class Fblogincreatetest {
	
	

	WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void createPageTest()
	{
		
		Fblogincreate fbc = new Fblogincreate(driver);
		fbc.signUpClick();
		fbc.signUpClick();
		
		String expectedtitle = "create page";
		String title =fbc.titleverification();
		Assert.assertEquals(title, expectedtitle);
	}

}