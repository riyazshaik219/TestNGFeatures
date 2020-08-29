package sampletestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
	}
	@Test(priority=1, groups="Title")
	public void goolgeTitleTest() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	@Test(priority=2, groups="Logo")
	public void googleLogoTest() {
		boolean val1=driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();
		System.out.println(val1);
	}
	@Test(priority=3, groups="Link")
	public void gmailLinkTest() {
		boolean val2=driver.findElement(By.linkText("Gmail")).isDisplayed();
	}
	@Test(priority=4, groups="test")
	public void test1() {
		System.out.println("test1");
	}
	@Test(priority=5, groups="test")
	public void test2() {
		System.out.println("test2");
	}
	@Test(priority=6, groups="test")
	public void test3() {
		System.out.println("test3");
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
