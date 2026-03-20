package practice;

import org.testng.annotations.Test;

public class testpractice {
	@Test
public void TestMethod() {
	System.out.println("...Executing Test Methods...");
}
	@Test(dependsOnMethods ="TestMethod")
	public void TestMethod1() {
		System.out.println(".......Executing testmethods");
	}
}
