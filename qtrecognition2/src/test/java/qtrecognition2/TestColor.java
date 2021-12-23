package qtrecognition2;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import org.openqa.selenium.By;
import org.openqa.selenium.support.Color;
import org.testng.annotations.Test;

public class TestColor extends LoginTest {

	@Test
	public void TestLoginPageGoldColors() {
		/* m1.1.3 */
		final String colorGold = "#FECC160";
		
		final String headerColor = Color.fromString(driver.findElement(By.xpath("/html[1]/body[1]/div[1]"))
				.getCssValue("background-color")).asHex();

	//	final String headerColor = Color
			//	.fromString(driver.findElement(By.xpath("//div[@class='myHeading']")).getCssValue("background-color"))
				//.asHex();
		assertThat("Gold color check", headerColor, is(equalTo(colorGold)));
		System.out.println("Gold color is not matches with approvied primary color");
	}

	@Test
	public void TestLoginPageNavyColors() {

		final String colorNavy = "#2a2559";

		final String btnfillColor = Color
				.fromString(driver.findElement(By.xpath("/html[1]/body[1]/div[2]/form[1]/button[1]")).getCssValue("background-color"))
				.asHex();
		assertThat("Navy color check", btnfillColor, is(equalTo(colorNavy)));

		System.out.println("Navy color is  matches with approvied primary color");

	}

	@Test
	public void TestLoginPageWhiteColors() {
		final String colorWhite = "#939598";

		final String bgColor = Color
				.fromString(driver.findElement(By.xpath("//div[@class='container']")).getCssValue("background-color"))
				.asHex();
		assertThat("White color check", bgColor, is(equalTo(colorWhite)));
		System.out.println("White color is  matches with approvied primary color");

	}

}
