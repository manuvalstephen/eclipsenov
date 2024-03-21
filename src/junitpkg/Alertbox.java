package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertbox {
	ChromeDriver driver;
	String baseurl="file:///C:/Users/prave/OneDrive/%EB%AC%B8%EC%84%9C/alert.html";
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
		
	}
	@Test
	public void login()
	
	{
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		Alert a=driver.switchTo().alert();
		String alerttext=a.getText();
		System.out.println("alerttext="+alerttext);
		a.accept();
		//a.dismiss();//to dismiss
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("praveen");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("abc");
		driver.findElement(By.xpath("/html/body/input[4]")).click();
	}
	

}
	


