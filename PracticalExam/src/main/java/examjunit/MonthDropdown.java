package examjunit;

import static org.junit.Assert.assertTrue;

//class 01-03-2021 time 2:00
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MonthDropdown {

	WebDriver driver;

	@Before
	public void launchBrowser() {

		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://techfios.com/test/101/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

	@Test
	public void Test3() {

		driver.findElement(By.cssSelector("input[name='data']")).sendKeys("Box1");
		driver.findElement(By.cssSelector("input[value='Add']")).click();

		driver.findElement(By.cssSelector("input[name='data']")).sendKeys("Box2");
		driver.findElement(By.cssSelector("input[value='Add']")).click();

		driver.findElement(By.cssSelector("input[name='data']")).sendKeys("Box3");
		driver.findElement(By.cssSelector("input[value='Add']")).click();

		driver.findElement(By.cssSelector("input[name='data']")).sendKeys("Box4");
		driver.findElement(By.cssSelector("input[value='Add']")).click();

		driver.findElement(By.cssSelector("input[name='allbox']")).click();

		driver.findElement(By.cssSelector("input[value='Remove']")).click();

	}

	// @After
	public void tearDown() {
		driver.close(); // closes the browser
		driver.quit(); // kills the process or it closes the object we have created

	}
}