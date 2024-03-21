package junitpkg;

import org.checkerframework.checker.calledmethods.qual.EnsuresCalledMethods.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitdemo {
	
	ChromeDriver driver;
	String baseurl="https://www.facebook.com";
	
	@Before
	public void setup()
	{
	    driver = new ChromeDriver();
		driver.get(baseurl);
	}
	
	@Test
	public void titleverification() 
	{
		String exp="facebook";
		String actualtittle = driver.getTitle();
		if(exp.equals(actualtittle))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
		@After
		public void teartown()
		{
			driver.quit();
		}
	

}
