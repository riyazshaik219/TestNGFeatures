package sampletestNG;

import org.testng.annotations.Test;

public class testNGfeatures {
@Test
public void loginTest() {
	System.out.println("Login Test");
	int i =10/0;
}
@Test(dependsOnMethods="loginTest")
public void HomePageTest() {
	System.out.println("Home Page Test");
}
}
