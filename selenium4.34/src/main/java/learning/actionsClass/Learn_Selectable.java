package learning.actionsClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Learn_Selectable {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	Actions actions=new Actions(driver);
	driver.manage().window().maximize();
	driver.get("https://jqueryui.com/selectable/");
	driver.switchTo().frame(0);
	List<WebElement> itemElements=
			driver.
			findElements
			(By.xpath("//ol[@id='selectable']/child::li[@class='ui-widget-content ui-selectee']"));
	
	for(WebElement item:itemElements)
	{
//		actions.keyDown(Keys.CONTROL)
//				.click(item)
//				.keyUp(Keys.CONTROL)
//				.perform();
		
		//way 2
		
		actions.clickAndHold(item).perform();
	}
	}

}
