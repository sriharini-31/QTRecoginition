package qtrecognition2;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class BaseTest {

	protected FirefoxDriver driver;

	@BeforeClass
	public void setup() {
		System.setProperty("WebDriver.chrome.driver", "D:\\");
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
		// driver = new ChromeDriver(); // sessionId = dsad23424fsfs
		driver = new FirefoxDriver();
		// driver.manage().window().maximize();
		//Timeouts implicitlyWait = driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://qtrecognition.testqtwiz.com/");
	}
	
	@AfterClass
	public void after() {
		driver.close();
	}


}
