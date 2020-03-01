package annonationsTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsTest2 {

	@BeforeSuite	
	public void networkLogin()
	{
		System.out.println("Before Suite - network login ");
	}

	@BeforeClass	
	public void logindb()
	{
		System.out.println("Before Class login db");
	}

	@BeforeTest	
	public void browserinit()
	{
		System.out.println("Before Test - login db");
	}

	@Test ()
	public void regTest()
	{
		//int i=1/0;
		System.out.println("Test 1 validate Registration Test");
	}
	@Test ()
	public void bookingTest()
	{
		System.out.println("Test 2 Validate Booking Test");
	}
	@Test ()
	public void cancelTest()
	{
		System.out.println("Test 3 Validate Cancelling Test");
	}

	@BeforeMethod	
	public void login()
	{
		System.out.println("Before MEthod - login db");
	}

	@AfterClass	
	public void logoutdb()
	{
		System.out.println("logout db");
	}
	@AfterMethod	
	public void logout()
	{
		System.out.println("After Method - logout application");
	}
	@AfterTest
	public void BrowserClose()
	{
		System.out.println("After Test - browser close");
	}
	@AfterSuite	
	public void closeNetword()
	{
		System.out.println("After Suite - Close Networ");
	}


}
