package demo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class readingdatafromdataprovider {
	
@DataProvider(name = "keyvaluedata")
public Object[][] getdata(){
	return new Object[][] {
		{"Browser","Chrome","3"},
		{"Username","admin","2"},
		{"Password","admin123","3"}
	};
}
@DataProvider(name ="sampledata -1")
Object [][] getInfo(){
	return new Object[][] {
		{"Browser","Chrome","1"},
		{"Username","admin","2"},
		{"Password","admin123","3"}
	};
}
@Test(dataProvider="keyvaluedata")
public void readingfromdataprovider(String key,String value,String num) {
	System.out.println("My key is:"+ key+"myvalue "+value+"position "+num);
}
}
