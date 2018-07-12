package assertions;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionTypes {
	SoftAssert soft ;
	
	@Test
	public void test1() {
		 soft = new SoftAssert();
		
		String expectedName = "James";
		int expectedAge = 28;
		
		
		soft.assertEquals("Ronaldo", expectedName, "Players name not matching");
		soft.assertEquals(32, expectedAge);
		
		System.out.println("Ending the test");
		soft.assertAll();
	}
	
	@Test
	public void w(){
		 soft = new SoftAssert();
		System.out.println("second test method starting");
		String s = "Hi";
		soft.assertEquals("Hi", s, "custom message");
		soft.assertAll();
	}
	
	
	
}












