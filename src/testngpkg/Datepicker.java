package testngpkg;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datepicker {
	
	
	ChromeDriver driver;
	String baseurl="https://www.trivago.in/en-IN";
	
	@BeforeTest
	public void  setup()
	{
		driver=new ChromeDriver();
		
	}
	@BeforeMethod
	public void urlopen()
	{
		driver.get(baseurl);
		driver.manage().window().maximize();
	}
	@Test
	public void datepicker()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().refresh();
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div[1]/div[3]/div/p[1]")).click();
		
		while(true)
		{
  WebElement month = driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div[1]/div[3]/div[2]/div[2]/div/div/div[2]/div[1]/div[1]"));
		String monthtext=month.getText();
		System.out.println(monthtext);
		
		if(monthtext.equals("October 2024"))
		{
			break;
		}
		else
		{
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div[1]/div[3]/div[2]/div[2]/div/div/div[1]/span[2]")).click();
			
		}
		}
		
		 List<WebElement> li=driver.findElements(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div[1]/div[3]/div[2]/div[2]/div/div/div[2]/div[1]/div[3]/div/div"));
		 for(WebElement ele:li) {
			 String date =ele.getText();
			 if(date.equals("12")) {
				 
				 ele.click();
			 }
		 }
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div[1]/div[3]/div[2]/div[3]/span[2]")).click();

		 
	}

}
