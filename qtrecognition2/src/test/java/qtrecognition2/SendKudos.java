package qtrecognition2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SendKudos extends ActivityPage {
	@Test
	public void sendkudos() throws InterruptedException {
		/*driver.findElement(By.xpath("//a[normalize-space()='Send Kudos']")).click();

		new Actions(driver).sendKeys("pooja.bn@qualitestgroup.com").perform();
		new Actions(driver).sendKeys(driver.findElement(By.cssSelector("#email_address")),
				"POOJA B N  (pooja.bn@qualitestgroup.com,)\"").perform();

		driver.findElement(By.xpath("//*[@id=\"trophy_list\"]/div[2]/div/div")).click();
		driver.findElement(By.cssSelector("#comment")).sendKeys("congratulation");
		driver.findElement(By.xpath("//button[normalize-space()='Send']")).click();*/
		
		
		
		
		driver.findElement(By.linkText("Send Kudos")).click();
		 
		 Set<String> windowHandles = driver.getWindowHandles();
		 
		 List<String> window2 = new ArrayList<String>(windowHandles);
		 
		 driver.switchTo().window(window2.get(0));
		 
		 driver.findElement(By.id("email_address")).sendKeys("pooja.bn@qualitestgroup.com", Keys.TAB);
			driver.findElement(By.xpath("//*[@id=\"trophy_list\"]/div[2]/div/div")).click();

		 driver.findElement(By.id("comment")).sendKeys("Hi QualityTestGroup");
		 driver.findElement(By.xpath("//button[text()='Send']")).click();
	}

	@Test
	public void sendkudosvissible() {
		if (driver.findElement(By.xpath("//h3[.='Recent Activities']")).isDisplayed()) {
			System.out.println("Recent Activity Page is Visible");
		} else {
			System.out.println("Recent Activity Page is InVisible");
		}

	}

	@Test
	public void RecentContactKudos() {
		driver.findElement(By.className("a[onclick='sendContactTo(\"ARPITA_ARAVIND_ATHARGA\",\"arpita.atharga@qualitestgroup.com,\")'] i[class='fas fa-paper-plane']")).click();

		new Actions(driver).sendKeys("(arpita.atharga@qualitestgroup.com,)").perform();
		new Actions(driver).sendKeys(driver.findElement(By.cssSelector("#email_address")),
				"ARPITA ARAVIND ATHARGA  (arpita.atharga@qualitestgroup.com,)").perform();

		driver.findElement(By.xpath("//*[@id=\"trophy_list\"]/div[2]/div/div")).click();
		driver.findElement(By.cssSelector("#comment")).sendKeys("congratulation");
		driver.findElement(By.xpath("//button[normalize-space()='Send']")).click();

	}

}

/*
 * @Test public void sendkudosfailed() throws InterruptedException {
 * driver.findElement(By.xpath("//a[normalize-space()='Send Kudos']")).click();
 * 
 * new Actions(driver).sendKeys("pooja.bn@qualitestgroup").perform(); new
 * Actions(driver).sendKeys(driver.findElement(By.xpath(
 * "//input[@id='email_address']")),
 * "POOJA B N  (pooja.bn@qualitestgroup.com,)").perform(); Thread.sleep(2000);
 * driver.findElement(By.
 * cssSelector("div[id='trophy_list'] div:nth-child(2) div:nth-child(1) div:nth-child(1)"
 * )).click(); //driver.findElement(By.xpath("//p[@id='ct_3']")).click();
 * driver.findElement(By.cssSelector("#comment")).sendKeys("congratulation");
 * driver.findElement(By.xpath("//button[normalize-space()='Send']")).click();
 * Thread.sleep(2000); }
 */
