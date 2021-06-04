package seleniumbasics2021;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "//Users//harsha//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		
		/*driver.get("http://google.com");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		
		driver.get("http://yahoo.com");
		driver.navigate().back();
		driver.quit();
		
		driver.get("http://google.com"); */
		
	//	driver.get("http://facebook.com"); 
		//driver.findElement(By.id("email")).sendKeys("abcd");
		//driver.findElement(By.name("pass")).sendKeys("xyz");
		//driver.findElement(By.id("test")).getText();
		//driver.findElement(By.cssSelector("input[name='email']")).sendKeys("harsha");
		//driver.findElement(By.cssSelector("input#email")).sendKeys("shree");
		//driver.findElement(By.linkText("Forgot account?")).click();
		//driver.findElement(By.xpath("//button[@name='login']")).click();
		//driver.findElement(By.className("inputtext")).sendKeys("helloworld");
	//	driver.close();

//1. Classes should not have spaces - compound classes cant be accepted if you want to take class name having spaces then use . between spaces of multiple class names
//2. When multiple values selenium identifies first one since it scans from top left
//3. To check validity use following in concole $x("") for xpath and $("") for css
//4. Xpath syntax : //tagname[@attribute = 'value']
//5. CSS syntax : tagname[attribute= 'value']
//6. CSS syntax if there is id attribute : tagname#id
//7. CSS syntax if there is classname attribute : tagname.classname
//8. For value which keeps on changing, we can check subtext by using contains with xpath syntax 
		//tagname[contains(@attribute,'value')]
/*9. For value which keeps on changing, we can check subtext by using contains with css syntax 
		tagname[attribute*='value'] */
/* Eg: $x("//a[contains(@class,'signin')]")
	   $("a[title*='Sign in']") */
/* 10. When parent is dynamic and sibling is static(everytime id is getting refreshed to new value)
 * Traverse from sibling to sibling : //*[@id='tablist1-tab1']/following-sibling::li[2]
 * Traverse back to parent using sibling : //*[@id='tablist1-tab1']/parent::ul
 */
//11. Using text attribute to identify element : //*[text()='Selenium']
//12. If there is space in classname then using css selector : .input.inputtext
/*13. Select dropdown - static dropdown automation
 * WebElement staticDropdown = driver.findElement(By.id(""));
 * Select dropdown = new Select(staticDropdown);
 * dropdown.selectByIndex(3);
 */
	}
}
