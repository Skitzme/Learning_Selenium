package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_CheckBox {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/checkbox.xhtml");
//		WebElement checkBoxStatus=	driver.findElement(By.name("j_idt87:j_idt102_input"));
//		if(checkBoxStatus.isEnabled())
//		{
//			System.out.println("enabled");
//			checkBoxStatus.click();
//		}
//		else
//		{
//			System.out.println("disabled");
//			
//		}
		
		//select all
		
		List<WebElement> allCheckBox=
				driver.findElements(By.xpath("//table[@id='j_idt87:basic']//descendant::label"));
	for(WebElement checkbox:allCheckBox)
	{
		if(checkbox.isEnabled())
		{
			System.out.println("enabled");
			checkbox.click();
		}
		else {
			System.out.println("not enabled");
		}
	}
	
	}

}
