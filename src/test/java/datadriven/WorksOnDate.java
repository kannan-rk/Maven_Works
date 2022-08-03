package datadriven;

import java.text.SimpleDateFormat;
import java.util.Date;

public class WorksOnDate {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);

		// To change date format
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		String format = dateFormat.format(date);
		System.out.println(format);
	}
}
