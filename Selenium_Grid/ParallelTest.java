package Selenium_Grid;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.lang.reflect.UndeclaredThrowableException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.RemoteWebDriverBuilder;
import org.testng.annotations.Test;

public class ParallelTest 
{
	public WebDriver driver;
	@Parameters({"bname"})
  @Test
  public void CrossBrowserAmazonlaunch(String bname) throws MalformedURLException 
  {
	  if (bname.equals("Chrome"))
	  {
		  ChromeOptions options= new ChromeOptions();
		  driver = new RemoteWebDriver(new URL("http://localhost:4444"),options);
		  System.out.println("Session created on Chrome");
	  }
	  else if (bname.equals("Firefox"))
	  { 
		 FirefoxOptions options= new FirefoxOptions();
		  driver = new RemoteWebDriver(new URL("http://localhost:4444"),options);
		  System.out.println("Session created on Firefox");
	  }
	  else if (bname.equals("Edge")) 
	  {
		 EdgeOptions options= new EdgeOptions();
		  driver = new RemoteWebDriver(new URL("http://localhost:4444"),options);
		  System.out.println("Session created on Edge");
	  }
	  System.out.println("Remote connectivity successfull!!");
	  
		  driver.get("https://www.amazon.in/");
		  System.out.println("Title is" + " "+ driver.getTitle());
		  driver.quit();
		  
		  
	  }
  }

