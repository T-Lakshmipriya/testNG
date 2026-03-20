package practice;

import java.lang.reflect.Method;

import org.testng.annotations.Test;
import genericutility.baseclass;

public class demotest extends baseclass {
	@Test(priority=0)
	public void logIn(Method m1) {
		System.out.println("Executing "+ m1);
	}
	@Test(dependsOnMethods ="logIn")
	public void addEmployee(Method m2) {
		System.out.println("Executing"+m2);
	}
	@Test(dependsOnMethods ="logIn")
	public void logOut(Method m3) {
		System.out.println("Executing"+m3);
	}
}
