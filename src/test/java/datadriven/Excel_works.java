package datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_works {
	public static void main(String[] args) throws IOException {
		// Mention the path of the excel sheet
		File file = new File(
				"C:\\Users\\santhiya\\eclipse-workspace\\readExcelData.zip_expanded\\Maven_works\\Excel sheets\\Test data.xlsx");

		// Get the objects/bytes from file
		FileInputStream stream = new FileInputStream(file);

		// Create workbook --> collection of sheets
		Workbook workbook = new XSSFWorkbook(stream);

		// Get the sheet name
		Sheet sheet = workbook.getSheet("Data");

		// Get the row
		Row row = sheet.getRow(1);

		// Get the cell and print
		Cell cell = row.getCell(1);
		System.out.println(cell);

		// Get row count
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println(physicalNumberOfRows);

		// To get cell count
		int physicalNumberOfCells = row.getPhysicalNumberOfCells();
		System.out.println(physicalNumberOfCells);

		// To get all cell from a particular row
		Row row1 = sheet.getRow(1);
		for (int i = 0; i < row1.getPhysicalNumberOfCells(); i++) {
			Cell cell2 = row1.getCell(i);
			System.out.println(cell2);
		}

		// To get all data in a sheet
		// iterate all rows
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			// get each row
			Row row2 = sheet.getRow(i);
			// iterate all cells
			for (int j = 0; j < row2.getPhysicalNumberOfCells(); j++) {
				// get the each cell
				Cell cell2 = row.getCell(j);
				System.out.println(cell2);
			}
		}

	}
}
