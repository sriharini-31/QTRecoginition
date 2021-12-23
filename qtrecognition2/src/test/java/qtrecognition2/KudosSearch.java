package qtrecognition2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class KudosSearch extends SendKudos {
	@Test
	public void kudosvisible() {
		if (driver.findElement(By.xpath("(//div[@class='jumbotron'])[3]")).isDisplayed()) {
			System.out.println("Kudos Search is Visible");
		} else {
			System.out.println("Kudos Search is InVisible");
		}
	}

	@Test
	public void search_name_or_mailid() {

		driver.findElement(By.id("s_e_add")).sendKeys("PRAJWAL H S", Keys.TAB);
		driver.findElement(By.xpath("(//i[@class='fab fa-searchengin'])[3]")).click();
		
		//driver.get("http://jsbin.com/osebed/2");
		Select names = new Select(driver.findElement(By.id("s_e_add")));
		names.selectByVisibleText("PRAJWAL H S");
		names.selectByIndex(2);

	}

}
