package practice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class demosoftassert {

	
		@Test
		public void demoTest() {
			String ActualValue ="PECC";
			String expectedvalue ="PEC";
			SoftAssert sa = new SoftAssert();
			sa.assertEquals(ActualValue,expectedvalue);
			if(ActualValue.equals(expectedvalue)) {
				System.out.println("pass");
			}else {
				System.out.println("fail");
			}
			sa.assertAll();
		}

	}


