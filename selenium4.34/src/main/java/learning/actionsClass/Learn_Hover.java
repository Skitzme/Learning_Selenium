package learning.actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Learn_Hover {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practice-automation.com/hover/");
		WebElement hover=driver.findElement(By.cssSelector("#mouse_over"));
		Actions actions=new Actions(driver);
		actions.moveToElement(hover).release().perform();
		
		System.out.println(hover.getText());

	}

}
