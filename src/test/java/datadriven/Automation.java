package datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automation {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");

		File file = new File(
				"C:\\Users\\santhiya\\eclipse-workspace\\readExcelData.zip_expanded\\Maven_works\\Excel sheets\\Automation.xlsx");

		Workbook workbook = new XSSFWorkbook();

		Sheet sheet = workbook.createSheet("Skills");

		WebElement dDnSkills = driver.findElement(By.id("Skills"));

		Select select = new Select(dDnSkills);

		List<WebElement> options = select.getOptions();

		for (int i = 0; i < options.size(); i++) {
			WebElement element = options.get(i);
			String text = element.getText();
			Row row = sheet.createRow(i);
			Cell cell = row.createCell(0);
			cell.setCellValue(text);
			FileOutputStream out = new FileOutputStream(file);
			workbook.write(out);

		}

	}
}
