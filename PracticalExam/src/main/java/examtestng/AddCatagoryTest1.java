package examtestng;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AddCatagoryTest1 {

	WebDriver driver;

	@BeforeMethod
	public void TestNGTest1() {

		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://techfios.com/test/101/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

	 @Test
	public void TestCase1()

	{
		driver.findElement(By.cssSelector("input[name='data']")).sendKeys("HelloWorld");
		driver.findElement(By.cssSelector("input[value='Add']")).click();
		System.out.println("Catagory is added and displayed");

	}

	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();

	}

}
