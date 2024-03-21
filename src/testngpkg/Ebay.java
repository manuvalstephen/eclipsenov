package testngpkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ebay {
	
	ChromeDriver driver;
	String baseurl="https://www.ebay.com/";
	
	@BeforeTest
	public void  setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
	}
	@Test
	public void ebaytest() {
		
     //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // implicit waits
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(20));
		
		
		WebElement electronics=driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]/a"));
		Actions act = new Actions(driver);

		act.moveToElement(electronics);
						
	    act.perform();
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"vl-flyout-nav\\\"]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a"))).click()	;    
	//	driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a")).click();
       
       // act.perform();

	}
	

}
