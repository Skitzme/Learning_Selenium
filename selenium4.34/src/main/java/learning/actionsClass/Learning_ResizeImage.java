package learning.actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Learning_ResizeImage {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Actions actions=new Actions(driver);
		driver.get("https://leafground.com/drag.xhtml");
//		WebElement reSize=driver.findElement
//		(By.xpath("//div[contains(@class,'ui-icon-gripsmall-diagonal-se')]"));
//		actions.clickAndHold(reSize).moveByOffset(0, -10).release().perform();
		
		WebElement leftResize=driver.findElement
				(By.xpath("//div[contains(@class,'ui-resizable-e')]"));
		actions.dragAndDropBy(leftResize, -10, 0).perform();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement sizeToast=wait.until(ExpectedConditions.
	visibilityOfElementLocated(By.xpath("//div[contains(@class,'ui-growl-message')]")));
		System.out.println(sizeToast.getText());
		driver.quit();
	}

}
