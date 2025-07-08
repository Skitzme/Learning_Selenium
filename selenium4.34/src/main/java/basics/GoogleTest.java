package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.google.com/");
		driver.navigate().to("https://www.google.com/");
	WebElement gmail=	driver.findElement(By.linkText("Gmail"));
	gmail.click();
	
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	
	}

}
