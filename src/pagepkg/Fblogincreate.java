package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fblogincreate {
	
	WebDriver driver;
	
	By fbcreate=By.xpath("//*[@id=\"reg_pages_msg\"]/a");
	By fbsignup=By.xpath("//*[@id=\"blueBarDOMInspector\"]/div/div[2]/div/div/span/a");
	
	public Fblogincreate(WebDriver driver) {
		this.driver=driver;	
	}
	
	public void click() {
		
		driver.findElement(fbcreate).click();
		
	}

	public String titleverification()
	{
	String actualtitle = driver.getTitle();
	return actualtitle;
	
	}

	
	public void signUpClick()
	{
		driver.findElement(fbsignup).click();
	}

}


