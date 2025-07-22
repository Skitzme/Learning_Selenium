package basics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGround_Windows {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/window.xhtml");
		String parent=	driver.getWindowHandle();
		WebElement element=driver.findElement(By.id("j_idt88:new"));
		element.click();
		
		
		Set<String> windowHandles=	driver.getWindowHandles();
		
		System.out.println("no of windows: "+windowHandles.size());
		
		for(String handle:windowHandles) {
			if(!parent.contentEquals(handle))
			{
				driver.switchTo().window(handle);
				System.out.println("Cirrent Url: "+driver.getCurrentUrl());
				
			}
		}
		
		driver.switchTo().window(parent);
		System.out.println(driver.getTitle());
		driver.close();
		
	}

}
