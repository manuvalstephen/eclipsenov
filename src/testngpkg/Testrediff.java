package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testrediff {
	
	ChromeDriver driver;
	String baseurl="https://register.rediff.com/register/register.php?FormName=user_details/";
	
	@BeforeTest(alwaysRun = true)
	public void setup() 
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod(alwaysRun = true)
	public void loadurl()
	{
		driver.get(baseurl);

	}

	@Test(priority=2,groups= {"smoke"})
	public void titleverification()
	{
		String expectedtitle="rediff.com";
		String actualtitle = driver.getTitle();
		System.out.println("actual title is : "+actualtitle);
		if(expectedtitle.equals(actualtitle))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}

	@Test(priority=3,groups= {"smoke","sanity"})
	public void logoverification()
	{
		boolean logo = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img")).isDisplayed();
		if(logo)
		{
			System.out.println("logo is displayed");
		}
		else
		{
			System.out.println("logo is not displayed");
		}
	}
	@Test(priority=1,groups= {"sanity"})
	public void fullnamefield()
	{
		WebElement button=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input"));
		if(button.isEnabled())
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
	@Test(priority=5,groups= {"regression"})
	public void buttonenable()
	{
		WebElement button=driver.findElement(By.xpath("//*[@id=\"Register\"]"));
		if(button.isEnabled())
		{
			System.out.println("button is enabled");
		}
		else
		{
			System.out.println("button is not enabled");
		}
	}
	@Test(priority=4,groups= {"smoke","regression"})
	public void buttontestverification()
	{
	String buttontext=	driver.findElement(By.xpath("//*[@id=\"Register\"]")).getAttribute("value");
		if(buttontext.equals("create my account"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		}
	
}

