package sampletestNG;

import org.testng.annotations.Test;

public class invocationCountTest {
@Test(invocationCount=20)
public void sum() {
	int a=10;
	int b=20;
	int c=a+b;
	System.out.println(c);
}
}
