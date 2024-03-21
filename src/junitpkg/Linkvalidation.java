package junitpkg;

import java.net.HttpURLConnection;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import org.junit.Test;

public class Linkvalidation {
	String link="https://www.google.com";
	
	@Test
	public void test()
	{
		try {
			URL u=new URL(link);
		 HttpURLConnection con=(HttpURLConnection)u.openConnection();
		 con.connect();
		 int code=con.getResponseCode();
		
		if(code==200)
		{
			System.out.println("response code is 200= succesfull");
		}
		else
		{
			System.out.println("not expected");
		}
		}
		catch(Exception e) 
			{
			
				System.out.println(e.getMessage());
			}
	}

}
