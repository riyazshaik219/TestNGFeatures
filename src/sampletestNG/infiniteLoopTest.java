package sampletestNG;

import org.testng.annotations.Test;

public class infiniteLoopTest {
//@Test
//public void infiniteLoopTest() {
//	int i=1;
//	while(i==1) {
//		System.out.println(i);
//	}
//}
	@Test(expectedExceptions=NumberFormatException.class)
	public void test1() {
		String s = "100A";
		Integer.parseInt(s);
	}
}
