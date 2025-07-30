package otherConcepts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learn_FileUploading {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.ilovepdf.com/merge_pdf");
		WebElement element=driver.findElement(By.cssSelector("#uploader"));
		element.click();
		Thread.sleep(100);
		StringSelection selection=
			new StringSelection("C:\\Users\\kSK92\\Downloads\\css.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, selection);
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);//press ctrl key
		robot.keyPress(KeyEvent.VK_V); //press v
		robot.keyRelease(KeyEvent.VK_V); //release v
		robot.keyRelease(KeyEvent.VK_CONTROL); //release ctrl
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		

	}

}
