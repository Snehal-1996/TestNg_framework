package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class TestCasesDemo {
	
	WebDriver driver;// declaring globally
	
	@SuppressWarnings("deprecation")
	@BeforeClass
	public void setup() {
		 //WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "C:/Users/SNEHAL/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		//ChromeDriverManager.getInstance().setup(); //downloading and installing ChromeDriver
		//WebDriver driver = new ChromeDriver(); //initializing ChromeDriver 
	     driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		 driver.get("https://www.google.com/");
				
	}
	
	@Test(groups = "Verify Tittle")
	public void get_Google_TitleTest() {
		String title=driver.getTitle();
		System.out.println(title);
		
		Assert.assertEquals(title, "Google","title is not matching");
	}
	
	@Test(groups = "Verify Logo")
	public void google_logoTest() {
		boolean b=driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed();// is displayed giving boolean value true/false
		Assert.assertTrue(b);
	//	Assert.assertEquals(b, true);
	}
	
	@Test(groups = "VerifyLink")
	public void mail_linkTest() {
	 	boolean b=driver.findElement(By.linkText("Gmail")).isDisplayed();
	}
	
	
	
	
	
	@AfterClass
	public void teardown() {
		
		driver.quit();
	
	}

}
