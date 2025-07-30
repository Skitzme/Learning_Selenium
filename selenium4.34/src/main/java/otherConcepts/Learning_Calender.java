package otherConcepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_Calender {
	enum Month {
        JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE,
        JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
    }

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		driver.get("https://www.irctc.co.in/nget/train-search");
		//driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
		WebElement datePicker=driver.findElement(By.xpath("//span[contains(@class,'ui-calendar')]/child::input"));
		datePicker.click();
		
		while(true)
		{
			WebElement monthsPicker=driver.findElement(By.xpath("//span[contains(@class,'datepicker-month')]"));
			String monthName=monthsPicker.getText();
			if(monthName.equals("September"))
			{
				WebElement date=driver.findElement(By.xpath("//a[text()='6']"));
				date.click();
				break;
			}
			else
			{
				WebElement rightArrow=driver.findElement(By.xpath("//span[contains(@class,'pi-chevron-right')]"));
				rightArrow.click();
			}
		}
		
		
		
		
		

	}

}
