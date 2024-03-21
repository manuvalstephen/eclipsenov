package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkvalidation2 {
	
	String baseurl = "https://www.google.com/";
    ChromeDriver driver;
    
    @Before
    public void setup()
    {
    	driver = new ChromeDriver();
    	driver.get(baseurl);
    }
    
    @Test
    public void linkvalidation()
    {
    	
    }
}
