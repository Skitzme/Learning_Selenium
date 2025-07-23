package learning.actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Learn_DragandDrop {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://letcode.in/draggable");  
	        Actions actions = new Actions(driver);
	        WebElement ele1=driver.findElement(By.cssSelector("#sample-box"));
	        Action build=actions.dragAndDropBy(ele1, 20, 200).build();
	        build.perform();
	}

}
