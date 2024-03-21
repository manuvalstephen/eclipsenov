package testngpkg;

import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazonwindow {
	
	ChromeDriver driver;
	String baseurl="https://www.amazon.in/";
	
	@BeforeTest
	public void  setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
	}
	
	@Test
	public void amazonsearch()
	{
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobiles");
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		
		String expectedtittle = "https://www.amazon.in/s?k=mobiles&ref=nb_sb_noss";
		String actualtittle=driver.getTitle();
		if (expectedtittle.equals(actualtittle))
		{
			System.out.println("tittle is same");
		}
		else
		{
			System.out.println("tittle is not same");
		}
		
		String parentwindow = driver.getWindowHandle();
		System.out.println("parent window tittle "+ driver.getTitle());
		
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[1]/div/div[2]/div/span/a/div/img")).click();

		
		Set<String> allwindowhandles = driver.getWindowHandles();
		for (String handle : allwindowhandles) 
		{
			if(!handle.equalsIgnoreCase(parentwindow)) {
				driver.switchTo().window(handle);
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div[5]/div[3]/div[1]/div[3]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/div/form/div/div/div[37]/div[1]/span/span/span/input")).click();
		
			}
		}
	}
}
