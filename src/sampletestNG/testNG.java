package sampletestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNG {

	//pre-conditions
	@BeforeSuite //it will be executed 1st
	public void setup()
	{
		System.out.println("set up chrome");
	}
	@BeforeTest // 2nd
	public void LaunchBrowser()
	{
		System.out.println("launch browser");
	}
	@BeforeClass //3rd
	public void login()
	{
		System.out.println("login to app");
	}
	
	@BeforeMethod //4th
	public void enterURL()

	{
		System.out.println("enter the url");
	}
	//testcases
		@Test //5th
		public void googleTitleTest()
		{
			System.out.println("verifytitle");
		}
		@Test
		public void search()
		{
			System.out.println("search test");
		}
		@Test
		public void googleLogo() {
			System.out.println("Google Logo");
		}
	//post conditions
		@AfterMethod //6th
		public void logout()
		{
			System.out.println("logout from app");
		}
		@AfterClass //7th
		public void closeBrowser()
		{
			System.out.println("close the browser");
		}
		@AfterTest //8th
		public void deleteAllCookies()
		{
			System.out.println("delete cookies");
		}
	@AfterSuite //9th
	public void htmlreports()
	{
		System.out.println("generate html report");
	}
	
	
	
}
