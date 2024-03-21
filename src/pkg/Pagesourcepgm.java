package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Pagesourcepgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		
		String baseur1="https://www.google.com";
		driver.get(baseur1); 
		String src=driver.getPageSource();
		if(src.contains("Gmail"))
		{
			System.out.println(" gmail text is present ");
		}
		else
		{
			System.out.println(" gmail text is not present ");
		}
		
		driver.quit();
	}

}
