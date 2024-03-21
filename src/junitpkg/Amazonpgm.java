package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonpgm {
	
	
	ChromeDriver driver;
	String baseurl="https://www.amazon.in/";
	
	@Before
	public void  setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
	}
	
	
	@Test
	public void amazonsearch() throws InterruptedException
	{
	
		driver.findElement(By.xpath("//form/div[2]/div/input")).sendKeys(" mobiles");
		driver.findElement(By.xpath("//form[@id='nav-search-bar-form']/div[3]/div/span/input")).click();
		
		driver.findElement(By.xpath("//*[@id='nav-xshop']/a[4]")).click();
		driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click();//signin 
		driver.navigate().back();
        Thread.sleep(2000);
        
		driver.findElement(By.xpath("//*[@id='nav-cart-count']")).click(); //cart
		driver.findElement(By.xpath("//*[@id='nav-hamburger-menu']")).click(); //hamburgermenu
	}
	
	
 
}
