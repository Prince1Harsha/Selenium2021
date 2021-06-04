package dropdowns;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdowns {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "//Users//harsha//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.findElement(By.id("autosuggest")).sendKeys("ind");

		Thread.sleep(4000);

		List<WebElement> options =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

		for(WebElement option :options)
		{

			if(option.getText().equalsIgnoreCase("India"))
			{
				option.click();
				Thread.sleep(2000);
				break;
			}

		}
		driver.quit();
	}

}

