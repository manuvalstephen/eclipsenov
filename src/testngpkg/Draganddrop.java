package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Draganddrop {
	
	
	ChromeDriver  driver;
	String baseurl="https://demo.guru99.com/test/drag_drop.html";
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
	}
	
	@Test
	public void draganddropmethod()
	{
		WebElement amount = driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement debit = driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
		WebElement bank = driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		WebElement account = driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
		Actions act = new Actions(driver);
		act.dragAndDrop(amount, debit);
		act.dragAndDrop(bank, account);
		
		
		WebElement sales = driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
		WebElement creditaccount = driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
		WebElement creditamount = driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
		act.dragAndDrop(sales, creditaccount);
		act.dragAndDrop(amount, creditamount);
		act.perform();
		
		WebElement perfect = driver.findElement(By.xpath("//*[@id=\"equal\"]/a"));
		if(perfect.isDisplayed())
		{
			System.out.println("Perfect is Displayed");
		}
		else
		{
			System.out.println("Not Displayed");
		}
	}

}
