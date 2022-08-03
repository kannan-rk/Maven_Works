package com.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	WebElement element;
	Select select;
	Alert alert;
	Actions actions;
	Robot robot;
	JavascriptExecutor executor;
	TakesScreenshot screenshot;

	public static void getDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void loadUrl(String url) {
		driver.get(url);
	}

	public void clearTxt(WebElement element) {
		element.clear();
	}

	public static void maximize() {
		driver.manage().window().maximize();
	}

	public void type(WebElement element, String data) {
		element.sendKeys(data);
	}

	public void click(WebElement element) {
		element.click();
	}

	public WebElement findElementById(String attributeValue) {
		WebElement element = driver.findElement(By.id(attributeValue));
		return element;
	}

	public String getTitle() {
		String title = driver.getTitle();
		return title;
	}

	public WebElement findElementByName(String attributeValue) {
		WebElement element = driver.findElement(By.name(attributeValue));
		return element;
	}

	public WebElement findElementByClassName(String attributeValue) {
		WebElement element = driver.findElement(By.className(attributeValue));
		return element;
	}

	public WebElement findElementByXpath(String xpath) {
		WebElement element = driver.findElement(By.xpath(xpath));
		return element;
	}

	public String getUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	public String getText(WebElement element) {
		String text = element.getText();
		return text;
	}

	public Alert acceptAlert() {
		Alert alert2 = driver.switchTo().alert();

		alert2.accept();
		return alert2;

	}

	// 99%
	public String getAttribute(WebElement element, String value) {
		String attribute = element.getAttribute(value);
		return attribute;
	}

	public String printAttribute(WebElement element, String value) {
		String attribute = element.getAttribute("value");
		return attribute;
	}

	// 1%
	public String getAttributeValue(WebElement element, String attributeName) {
		String attribute = element.getAttribute(attributeName);
		return attribute;
	}

	public void selectOptionByText(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}

	public void selectOptionByAttribute(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}

	public void selectOptionByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}

	public void typeJs(WebElement element, String text) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("argument[0].setAttribute('value'," + text + ")", element);
	}

	public void navigateTo(String url) {
		driver.navigate().to(url);
	}

	public void navigateBack() {
		driver.navigate().back();
	}

	public void navigateForward() {
		driver.navigate().forward();
	}

	public void navigateRefresh() {
		driver.navigate().refresh();
	}

	public void clear() {
		element.clear();
	}

	public void deselectByVisibleText(String text) {
		select.deselectByVisibleText(text);
	}

	public void deselectByIndex(int index) {
		select.deselectByIndex(index);
	}

	public void deselectByValue(String value) {
		select.deselectByValue(value);
	}

	public void deselectAll() {
		select.deselectAll();
	}

	public void SelectByVisibleText(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}

	public void selectByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}

	public void selectByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}

	public void Sleep(int millis) throws InterruptedException {
		Thread.sleep(millis);

	}

	public void alertAccept() {
		Alert alert2 = driver.switchTo().alert();
		alert2.accept();
	}

	public void alertDismiss() {
		alert.dismiss();
	}

	public void moveToElement(WebElement element) {
		actions.moveToElement(element);
	}

	public Actions dragAndDrop(WebElement source, WebElement target) {
		Actions dragAndDrop = actions.dragAndDrop(source, target);
		return dragAndDrop;
	}

	public Actions doubleClick() {
		Actions doubleClick = actions.doubleClick();
		return doubleClick;
	}

	public Actions ContextClick() {
		Actions contextClick = actions.contextClick();
		return contextClick;
	}

	public void perform() {
		actions.perform();
	}

	public boolean isSelectted() {
		boolean selected = element.isSelected();
		return selected;
	}

	public boolean isMultiple() {
		boolean multiple = select.isMultiple();
		return multiple;

	}

	public void keyPress1(int keyevent) {
		robot.keyPress(keyevent);
	}

	public void robotTab() throws AWTException {
		new Robot().keyPress(KeyEvent.VK_TAB);
	}

	public void robotEnter() throws AWTException {
		new Robot().keyPress(KeyEvent.VK_ENTER);
	}

	public void keyPress(int keycode, int keyevent) {
		robot.keyPress(keycode);

	}

	public void keyRelease(int keycode, int keyevent) {
		robot.keyRelease(KeyEvent.VK_8);

	}

	public void close() {
		driver.close();
	}

	public void quit() {
		driver.quit();
	}

	public Object retrieveArgument(WebElement element) {
		Object executeScript = executor.executeScript("return arguments[0].getAttribute('Value'), greens");
		return executeScript;
	}

	public Object argumentsClick(WebElement element) {
		Object executeScript = executor.executeScript("arguments[0].click", "btnClick");
		return executeScript;
	}

	public Object scrollIntoView(WebElement element) {
		Object executeScript = executor.executeScript("arguments[0].scrollIntoView(false)", "View");
		return executeScript;
	}

	public Object scrollIntoViewTrue(WebElement element) {
		Object executeScript = executor.executeScript("arguments[0].scrollIntoView(true)", "view");
		return executeScript;
	}

	public boolean isEnabled() {
		boolean enabled = element.isEnabled();
		return enabled;

	}

	public boolean isDisplayed() {
		boolean displayed = element.isDisplayed();
		return displayed;
	}

	public WebDriver SwitchToFrame(int index) {
		WebDriver frame = driver.switchTo().frame(index);
		return frame;
	}

	public WebDriver SwitchToParentFrame() {
		WebDriver parentFrame = driver.switchTo().parentFrame();
		return parentFrame;
	}

	public WebDriver SwitchToDefaultContent() {
		WebDriver defaultContent = driver.switchTo().defaultContent();
		return defaultContent;
	}

	public Object getOptions() {
		Object screenshotAs = screenshot.getScreenshotAs(null);
		return screenshotAs;
	}

	public List<WebElement> getAllSelectedOptions() {
		List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
		return allSelectedOptions;
	}

	public WebElement getFirstSelectedOptions() {
		WebElement firstSelectedOption = select.getFirstSelectedOption();
		return firstSelectedOption;
	}

	public String getWindowHandle() {
		String windowHandle = driver.getWindowHandle();
		return windowHandle;
	}

	public Set<String> getWindowHandles() {
		Set<String> windowHandles = driver.getWindowHandles();
		return windowHandles;
	}

	public WebDriver switchToWindowByUrl(String url) {
		WebDriver window = driver.switchTo().window(url);
		return window;
	}

	public WebDriver switchToWindowByTitle(String title) {
		WebDriver window = driver.switchTo().window(title);
		return window;
	}

	public WebDriver switchToWindowById(String id) {
		WebDriver window = driver.switchTo().window(id);
		return window;
	}

	public String pageSource() {
		String pageSource = driver.getPageSource();
		return pageSource;
	}

	// Reusable methods for getData in Excel

	public String getData(String sheetName, int rowNum, int cellNum) throws IOException {
		String res = null;
		File file = new File(
				"C:\\Users\\santhiya\\eclipse-workspace\\readExcelData.zip_expanded\\Maven_works\\Excel sheets\\Adactin_datas.xlsx");

		FileInputStream fileInputStream = new FileInputStream(file);

		Workbook workbook = new XSSFWorkbook(fileInputStream);

		Sheet sheet = workbook.getSheet(sheetName);

		Row row = sheet.getRow(rowNum);

		Cell cell = row.getCell(cellNum);

		CellType type = cell.getCellType();

		switch (type) {
		case STRING:
			res = cell.getStringCellValue();
			break;
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
				res = dateFormat.format(dateCellValue);
			} else {
				double d = cell.getNumericCellValue();
				long check = Math.round(d);

				if (check == d) {
					res = String.valueOf(check);
				} else {
					res = String.valueOf(d);
				}
			}

		default:
			break;
		}
		return res;

	}

	// Reusable code for update value in cell
	public void updateData(String path, String sheetName, int rowNum, int cellNum, String newData, String oldData)
			throws IOException {
		File file = new File(path);

		FileInputStream fileInputStream = new FileInputStream(file);

		Workbook workbook = new XSSFWorkbook(fileInputStream);

		Sheet sheet = workbook.getSheet(sheetName);

		Row row = sheet.getRow(rowNum);

		Cell cell = row.getCell(cellNum);

		String value = cell.getStringCellValue();

		if (value.equals(oldData)) {
			cell.setCellValue(newData);
		}
		FileOutputStream out = new FileOutputStream(file);
		workbook.write(out);
	}

	// Reusable code to insert value in cell

	public void writeData(String sheetName, int rowNum, int cellIndex, String data) throws IOException {
		File file = new File(
				"C:\\Users\\santhiya\\eclipse-workspace\\readExcelData.zip_expanded\\Maven_works\\Excel sheets\\Adactin_datas.xlsx");

		FileInputStream fileInputStream = new FileInputStream(file);

		Workbook workbook = new XSSFWorkbook(fileInputStream);

		Sheet sheet = workbook.getSheet(sheetName);

		Row row = sheet.getRow(rowNum);

		Cell cell = row.createCell(cellIndex);

		cell.setCellValue(data);

		FileOutputStream out = new FileOutputStream(file);
		workbook.write(out);

	}

}
