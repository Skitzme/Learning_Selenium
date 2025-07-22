package basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Learning_Alert {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/alert.xhtml");
		/*
		 * WebElement simpleBtn= driver.findElement(By.id("j_idt88:j_idt91"));
		 * simpleBtn.click();
		 */
		//Alert alert=driver.switchTo().alert();
		/*
		 * alert.accept(); String value=
		 * driver.findElement(By.id("simple_result")).getText();
		 * System.out.println(value);
		 * 
		 * 
		 * WebElement confirmBtn= driver.findElement(By.id("j_idt88:j_idt93"));
		 * confirmBtn.click(); alert.dismiss(); String
		 * result=driver.findElement(By.id("result")).getText();
		 * System.out.println(result);
		 * 
		 * 
		 * WebElement promptBtn=driver.findElement(By.id("j_idt88:j_idt104"));
		 * promptBtn.click(); alert.sendKeys("hai"); alert.dismiss();
		 */
	
	driver.findElement(By.id("j_idt88:j_idt100")).click();
	WebElement sweetBtn=driver.findElement
	(By.xpath("(//a[@role='button'])[2]"));
	
	Actions actions=new Actions(driver);
	actions.moveToElement(sweetBtn).click();
	}

}
