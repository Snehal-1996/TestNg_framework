package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdown {
	WebDriver driver;
	
	@SuppressWarnings("deprecation")
	@Test
	public void test1() throws InterruptedException {
	
	
		System.setProperty("webdriver.gecko.driver", "C://Users//SNEHAL//Downloads//geckodriver-v0.34.0-win64//geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	 
		
		 WebElement dropdownElement=driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//p//select"));
		 dropdownElement.click();
		 
		 
		 Select dropdown = new Select(dropdownElement);

	        // Select option by visible text
	        dropdown.selectByVisibleText("Albania");

}
	
	
}