package qtrecognition2;

import org.openqa.selenium.By;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

	@Test
	public void Login() {

		/* P1.1.1 */
		driver.findElement(By.xpath("//input[@placeholder='Enter Username']"))
				.sendKeys("sri.harini@qualitestgroup.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter Password']")).sendKeys("P@ssw0rd");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@Test
	public void VerifyTitle() {
		String title = driver.getTitle();
		AssertJUnit.assertEquals(title, "QTRecognition");
		System.out.println("Title of Page" + " QTRecognition");

	}


	
	

}
