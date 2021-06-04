package framesdraganddrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingFramesAndDragAndDrop {

	public static void main(String[] args) {

		//SCENARIO: Switch to frame and perform drag and drop and then return back out of frame
		
		System.setProperty("webdriver.chrome.driver", "//Users//harsha//Downloads//chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("http://jqueryui.com/droppable/");
		
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		driver.switchTo().frame(0);
		
		//driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		
		Actions a = new Actions(driver);
		
		WebElement source = driver.findElement(By.id("draggable"));
		
		WebElement target = driver.findElement(By.id("droppable"));
		
		a.dragAndDrop(source, target).build().perform();
		
		driver.switchTo().defaultContent();

	}

}
