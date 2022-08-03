package sample.testNG;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.Test;

public class WorksOnDate {
	
	@Test()
	public void todayDate() {
		Date date = new Date();
		System.out.println(date);

		// To change date format
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		String format = dateFormat.format(date);
		System.out.println(format);
	}
}
