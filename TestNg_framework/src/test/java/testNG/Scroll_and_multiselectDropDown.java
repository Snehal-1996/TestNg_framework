package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Scroll_and_multiselectDropDown {
	
WebDriver driver;
	
	@SuppressWarnings("deprecation")
	@Test
	public void test1() throws InterruptedException {
	
	
		System.setProperty("webdriver.gecko.driver", "C://Users//SNEHAL//Downloads//geckodriver-v0.34.0-win64//geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().window().maximize();	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0, 500)");

		WebElement dropdownElement=driver.findElement(By.cssSelector("div[id='selectMenuContainer'] div[class='row'] div[class=' css-1hwfws3']"));
		dropdownElement.click();
		//driver.findElement(By.cssSelector("div[id='selectMenuContainer'] div[class='row'] div[class=' css-1hwfws3']")).sendKeys("Blue,Green");
		 
		Select dropdown = new Select(dropdownElement);

	        // Select option by visible text
	       // dropdown.selectByVisibleText("Green");
	      //  dropdown.selectByVisibleText("Blue");
	        dropdown.selectByIndex(0);
	        dropdown.selectByIndex(2);
	        

}}
