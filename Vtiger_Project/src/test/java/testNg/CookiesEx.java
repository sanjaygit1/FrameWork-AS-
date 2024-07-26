package testNg;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesEx {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	   driver.manage().window().maximize();
	
	   //To Check Cookies in WebPage
	Set<Cookie> cookies = driver.manage().getCookies();
	
	for (Cookie cookie : cookies) 
	{
		System.out.println("cookies name ="+cookie.getName()+"\t"+"Value="+cookie.getValue());
	}
	//To Delete Cookies in WebPage
	Thread.sleep(1000);
	driver.manage().deleteAllCookies();
	
	//Validation
	if(driver.manage().getCookies().isEmpty())
	{
		System.out.println("cookies cleared");
	}
	else
	{
		System.out.println("cookies not cleared");
	}

	//To ReCheck the cookies present in page
Set<Cookie> cookies1 = driver.manage().getCookies();
	
	for (Cookie cookie1 : cookies1) 
	{
		System.out.println("cookies name ="+cookie1.getName()+"\t"+"Value="+cookie1.getValue());
	}
	}

}
