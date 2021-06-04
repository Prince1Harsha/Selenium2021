package realtime;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitUsage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//Users//harsha//Downloads//chromedriver");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.findElement(By.cssSelector("[id='start'] button")).click();
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
			.pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
		
		//PROS: 2 msgs validation eg: card is accepted(3secs) and order is being processed(7secs)
		//then use fluent wait of 4secs to check at regular intervals to validate both msgs
		//WebDriverWait and FluentWait are both classes which come under explicit wait and implement wait interface
		//Fluent wait finds web element repeatedly at regular intervals of time until timeout or till the 
		//object is found
		//Unlike webdriverwait , fluent wait requires customized wait methods based on condition
		
		WebElement foo = wait.until(new Function<WebDriver,WebElement>(){
			
			public WebElement apply(WebDriver driver) {
			if(driver.findElement(By.cssSelector("[id='finish'] h4")).isDisplayed())
			{
				return driver.findElement(By.cssSelector("[id='finish'] h4"));
			}
			else 
				return null;
			
		}
		});
		System.out.println(driver.findElement(By.cssSelector("[id='finish'] h4")).getText());
	}
}
