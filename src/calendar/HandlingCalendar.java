package calendar;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCalendar {

	public static void main(String[] args) {

		//SCENARIO : Generic method to handle calendar
		System.setProperty("webdriver.chrome.driver", "//Users//harsha//Downloads//chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.path2usa.com/travel-companions");
//April 23
		driver.findElementByXPath(".//*[@id='travel_date']").click();

		while (!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText()
				.contains("June")) {
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		}

		List<WebElement> dates = driver.findElements(By.className("day"));
//Grab common attribute//Put into list and iterate
		int count = driver.findElements(By.className("day")).size();

		for (int i = 0; i < count; i++) {
			String text = driver.findElements(By.className("day")).get(i).getText();
			if (text.equalsIgnoreCase("12")) {
				driver.findElements(By.className("day")).get(i).click();
				break;
			}

		}
	}

}