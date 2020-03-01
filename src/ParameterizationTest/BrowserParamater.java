package ParameterizationTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class BrowserParamater {
	WebDriver driver;

	@Test
	@Parameters({"browser","username","password"})
	public void browserTest(String browser, String username, String password) throws InterruptedException
	{

		System.out.println("Test Case Started");
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.google.com");
			Thread.sleep(1000);
			String actual =driver.getTitle();//selenium method to get the title of the browser or application
			System.out.println(username);
			System.out.println(password);
			
			String expected = "Google";
			//int actual =1;
			Assert.assertEquals(expected, actual);
		}

		else if(browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "D:\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get("https://www.google.com");
		}
	}

	@Test(enabled=false)
	@Parameters({"username","password"})
	public void userTest(String username, String password) throws InterruptedException
	{

		System.out.println("Test Case Started");
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(1000);
		System.out.println(driver.getTitle());//selenium method to get the title of the browser or application
		System.out.println(username);
		System.out.println(password);
	}

	@Test(enabled=false)
	@Parameters({"username","password"})
	public void userTest1(String username, String password) throws InterruptedException
	{

		System.out.println("Test Case Started");
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(1000);
		System.out.println(driver.getTitle());//selenium method to get the title of the browser or application
		System.out.println(username);
		System.out.println(password);
	}
}