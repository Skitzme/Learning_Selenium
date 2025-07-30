package learning.actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Learning_Slider {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Actions actions=new Actions(driver);
		driver.get("https://leafground.com/drag.xhtml");
//		WebElement left=driver.findElement
//				(By.xpath("(//span[contains(@class,'ui-state-default')])[1]"));
//		actions.dragAndDropBy(left, -20, 0).perform();
//		
//		WebElement right=driver.findElement
//				(By.xpath("(//span[contains(@class,'ui-state-default')])[2]"));
//		actions.dragAndDropBy(right, 20, 0).perform();
		//progrees par
		
		WebElement progressBar=
				driver.findElement(By.cssSelector("#form\\:j_idt119"));
		progressBar.click();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement sizeToast=wait.until(ExpectedConditions.
	visibilityOfElementLocated(By.xpath("//div[contains(@class,'ui-growl-message')]")));
		System.out.println(sizeToast.getText());

	}

}
