package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LetCode_Buttons {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://letcode.in/button");
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		/*
		 * WebElement homeButton= driver.findElement(By.id("home"));
		 *  homeButton.click();
		 * System.out.println(driver.getCurrentUrl()); 
		 * driver.navigate().back();
		 * driver.navigate().forward();
		 */
		
//		WebElement positionBtn=driver.findElement(By.id("position"));
//		Rectangle  rect=positionBtn.getRect();
//		
//		System.out.println(positionBtn.getRect().getX());
//		System.out.println(positionBtn.getRect().getY());
//		
//		
//		System.out.println("x value: "+  rect.getX());
//		System.out.println("y value: " +rect.getY());
//		System.out.println(" height "+ rect.getHeight());
//		System.out.println(" weidth "+ rect.getWidth());
//		
//	System.out.println(positionBtn.getLocation().getX());
//	System.out.println(positionBtn.getLocation().getY());
//	
//	System.out.println(positionBtn.getSize().getHeight());
//	System.out.println(positionBtn.getSize().getWidth());
		
		/*
		 * WebElement findColorBtn= driver.findElement(By.id("color"));
		 * System.out.println(findColorBtn.getCssValue("background-color"));
		 */
		
	WebElement disabledBtn=	driver.findElement(By.id("isDisabled"));
	
	boolean status= disabledBtn.isEnabled();
	
	if(status!=true)
	{
		System.out.println("it is disabled");
	}
	else {
		System.out.println("it is enabled");
	}
	driver.quit();
	
	
	}

}
