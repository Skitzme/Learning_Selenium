package learning.actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Learn_Hover_FlipKart {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		Actions actions=new Actions(driver);
		driver.get("https://www.flipkart.com/");
		WebElement element=driver.findElement(By.xpath("//span[text()='Fashion']"));
		actions.moveToElement(element).perform();
		
		actions.moveToElement
		(driver.findElement(By.xpath("//a[@class='_1BJVlg _11MZbx']"))).perform();
	}

}
