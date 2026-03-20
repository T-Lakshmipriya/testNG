package demo;

import java.io.FileReader;
import java.io.IOException;

import org.testng.annotations.Test;

import java.io.BufferedReader;
public class readingdatafromcsvfile {
	@Test
	public void readcsvdata() throws IOException {

        String line = "";
      

        BufferedReader br = new BufferedReader(
                new FileReader("./src/test/resources/orangehrm.commondata/samplecsv"));

        while ((line = br.readLine()) != null) {
            String data[] = line.split(",");
            String key =data[0];
            String value =data[1];

          //  System.out.println("Username: " + data[0] + " Password: " + data[1]);
            System.out.println(key);
            System.out.println(""+value);
        }

        br.close();
    }
}