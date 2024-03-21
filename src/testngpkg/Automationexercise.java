package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Automationexercise {
	
	
	ChromeDriver driver;
	String baseurl="https://automationexercise.com/login";
	
	@BeforeTest
	public void  setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
	}
	@Test 
	public void signup()
	{
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
		
	driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]")).sendKeys(" manuval");
	driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")).sendKeys(" manuval123@gmail.com");
	
	driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button")).click();
	
	driver.findElement(By.xpath("//*[@id=\"id_gender1\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(" manuval321");
	
	WebElement day=driver.findElement(By.xpath("//*[@id=\"days\"]"));
	Select daydetails = new Select(day);
	daydetails.selectByValue("1");
	  
	WebElement month=driver.findElement(By.xpath("//*[@id=\"months\"]"));
	Select monthdetails = new Select(month);
	monthdetails.selectByVisibleText("October");
	
	WebElement year=driver.findElement(By.xpath("//*[@id=\"years\"]"));
	Select yeardetails = new Select(year);
	yeardetails.selectByValue("2000");
	
	
	driver.findElement(By.xpath("//*[@id=\"newsletter\"]")).click(); //checkbox
	driver.findElement(By.xpath("//*[@id=\"optin\"]")).click();  //checkbox
	
	
	driver.findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys(" manuval");
	driver.findElement(By.xpath("//*[@id=\"last_name\"]")).sendKeys(" stephen ");
	driver.findElement(By.xpath("//*[@id=\"company\"]")).sendKeys(" luminar ");
	driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys(" luminar technolab kakkanad ");
	driver.findElement(By.xpath("//*[@id=\"address2\"]")).sendKeys(" luminar technolab kakkanad ernakulam ");
	
	driver.findElement(By.xpath("//*[@id=\"state\"]")).sendKeys(" kerala");
	driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys(" angamaly");
	driver.findElement(By.xpath("//*[@id=\"zipcode\"]")).sendKeys(" 683581");
	driver.findElement(By.xpath("//*[@id=\"mobile_number\"]")).sendKeys(" 9876543210");
	
	driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/form/button")).submit();



	}

}
