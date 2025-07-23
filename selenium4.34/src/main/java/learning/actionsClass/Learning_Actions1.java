package learning.actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Learning_Actions1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://leafground.com/drag.xhtml");
		WebElement ele1	=driver.findElement(By.xpath("//div[@id='form:conpnl']"));
		Actions actions=new Actions(driver);
		actions.clickAndHold(ele1).moveByOffset(70, 10).build().perform();
		
		
//		WebElement sourceEle=driver.findElement(By.xpath("//div[@id='form:drag']"));
//		WebElement targetEle=driver.findElement(By.xpath("//div[@id='form:drop']"));
//		//actions.clickAndHold(sourceEle).moveToElement(targetEle).release(sourceEle).perform();
//		actions.dragAndDrop(sourceEle, targetEle).build().perform();
//		WebElement confirm=driver.findElement(By.xpath("//div[@id='form:drop_content']"));
//
//		System.out.println(confirm.getText());
		
		WebElement fromEle=driver.findElement(By.xpath("(//tr[@data-ri='9'])[last()]"));
		WebElement toEle=driver.findElement(By.xpath("(//tr[@data-ri='0'])[last()]"));
		actions.dragAndDrop(fromEle, toEle).build().perform();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement toastMsg=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'ui-growl-message')]")));
		System.out.println(toastMsg.getText());
		
//		 // Wait for the toast message to appear
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        WebElement toastMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(
//            By.xpath("//div[contains(@class,'ui-growl-message')]")
//        ));
//       // wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id(null))));
//        // Capture the full text
//        String fullMessage = toastMessage.getText();
//        System.out.println("Full Toast Message: " + fullMessage);
//		
//        //Draggable Columns
//        
//        WebElement nameEle=driver.findElement(By.xpath("//th[contains(@id,'form:j_idt94:j_idt95')]"));
//        WebElement quantityEle=driver.findElement(By.xpath("//th[contains(@id,'form:j_idt94:j_idt99')]"));
//        actions.dragAndDrop(nameEle, quantityEle).perform();
//        
//        
//        WebElement toastMessageCol = wait.until(ExpectedConditions.visibilityOfElementLocated(
//            By.xpath("//div[contains(@class,'ui-growl-message')]")));
//        String fullMessageCol = toastMessageCol.getText();
//        System.out.println("Full Toast Message: " + fullMessageCol);
//        
//		driver.quit();
	}

}
