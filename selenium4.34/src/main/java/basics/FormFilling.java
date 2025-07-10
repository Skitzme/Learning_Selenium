package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormFilling {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/edit");
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		By id=By.id("fullName");
		WebElement fullNameTextBox= driver.findElement(id);
		fullNameTextBox.clear();
		fullNameTextBox.sendKeys("anusdeen");

	}

}
