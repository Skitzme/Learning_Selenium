package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGround_Frames {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/frame.xhtml");
//		List<WebElement> frames	=driver.findElements(By.tagName("iframe"));
//		System.out.println("no of frames: "+ frames.size());
//		driver.switchTo().frame(0);
//		WebElement clickBtn= driver.findElement(By.xpath("/html/body/button"));
//		clickBtn.click();
		
	WebElement nestedFrames	=driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[2]/div/iframe"));
	driver.switchTo().frame(nestedFrames);
	List<WebElement> frames	=driver.findElements(By.tagName("iframe"));
	System.out.println("no of frames: "+ frames.size());
	driver.switchTo().frame("frame2");
	driver.findElement(By.xpath("/html/body/button")).click();
	
	driver.switchTo().parentFrame();
	driver.switchTo().defaultContent();
	}

}
