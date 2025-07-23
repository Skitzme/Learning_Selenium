package learning.actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProgressBar {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://leafground.com/drag.xhtml");  // Replace with your actual page URL

	        Actions actions = new Actions(driver);
	        Wait<WebDriver> wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	        
	        WebElement startBtn=driver.findElement(By.cssSelector("#form\\:j_idt119"));
	        startBtn.click();
	        
	        WebElement progressBar=driver.findElement(By.cssSelector("#form\\:j_idt121"));
	}

}
