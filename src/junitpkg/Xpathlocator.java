package junitpkg;

import java.time.Duration;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathlocator {
	
	
	ChromeDriver driver;
	String baseurl="https://www.instagram.com/";
	
	
	@Before
	public void setup()
	{
	 driver=new ChromeDriver();
	 driver.get(baseurl);
	}
	
	@Test
	public void instalogin() throws InterruptedException
	{	
		Thread.sleep(1000);
		//
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//form[@id='loginForm']/div/div[1]/div/label/input")).sendKeys("abcd@gmail.com");
	WebElement password=	driver.findElement(By.xpath("//form[@id='loginForm']/div/div[2]/div/label/input"));
	password.sendKeys("efghi");
	password.submit();		Thread.sleep(1000);
		//driver.findElement(By.xpath("//form[@id='loginForm']/div/div[3]/button")).click();
	}

}
