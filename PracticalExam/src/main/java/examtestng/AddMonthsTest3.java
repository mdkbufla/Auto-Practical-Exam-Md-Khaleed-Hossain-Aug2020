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

public class AddMonthsTest3 {

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
	public void TestCase3()

	{
		driver.findElement(By.cssSelector("input[name='data']")).sendKeys("asap");
		driver.findElement(By.cssSelector("input[value='Add']")).click();
		System.out.println("Catagory is added and displayed");

	}

	@Test
	public void TestCase2()

	{

		WebElement month_dropdown = driver.findElement(By.name("due_month"));

		Select month_dd = new Select(month_dropdown);

		List<WebElement> month_list = month_dd.getOptions();

		int total_month = month_list.size();

		System.out.println("Total month count is:  " + total_month);

		for (WebElement ele : month_list)

		{
			String month_name = ele.getText();

			System.out.println("Month = " + month_name);
		}

	}

    @AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();

	}

}
