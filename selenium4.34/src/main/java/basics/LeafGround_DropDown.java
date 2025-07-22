package basics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LeafGround_DropDown {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		Options options=driver.manage();
		options.window().maximize();
		
		options.deleteAllCookies();

		driver.get("https://leafground.com/select.xhtml");
		
		driver.findElement(By.xpath("//*[@id=\"j_idt87:auto-complete\"]/button")).click();
		
		WebElement courseDropdown = driver.findElement(By.id("j_idt87:auto-complete_hinput"));
        Select selectCourse = new Select(courseDropdown);
        if (selectCourse.isMultiple()) {
            selectCourse.deselectAll();
            selectCourse.selectByVisibleText("Selenium WebDriver");
            selectCourse.selectByIndex(2);
        }
		
		
	}

}


//we have to use expilict wait


/*
 * WebElement
 * elements=driver.findElement(By.id("j_idt87:auto-complete_hinput"));
 * 
 * Select select=new Select(elements);
 * 
 * List<WebElement> options1=select.getOptions(); for(WebElement
 * option:options1) { System.out.println(option.getText()); }
 */
