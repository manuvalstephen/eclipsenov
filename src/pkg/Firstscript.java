package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Firstscript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ChromeDriver driver=new ChromeDriver(); // to launch chrome browser
		driver.get("https://www.google.com");   // get url 
		
		String exp="Google";
		String actualtittle = driver.getTitle();
		if(exp.equals(actualtittle))
		{
			System.out.println("expected result is pass");
		}
		else
		{
			System.out.println("expected result is fail");
		}
		driver.quit();

	}

}


