package qtrecognition2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class ActivityPage extends TestColor {

	@Test
	public void LoginName() {
		WebElement username = driver.findElement(By.className("header-font-size"));
		username.isDisplayed();
		Assert.assertTrue(false);

	}

	@Test
	public void activitypageimage() {

		WebElement image = driver.findElement(By.xpath("//div/img[@src='img\\\\avatar.svg']"));
		image.isDisplayed();
		Assert.assertTrue(false);

	}

	@Test
	public void VerifyTitle() {
		String title = driver.getTitle();
		AssertJUnit.assertEquals(title, "QTRecognition");
		System.out.println("Title of Page" + " QTRecognition");

	}

}
