package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jquery_Checkbox {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/checkboxradio/");
        driver.switchTo().frame(0);
//        List<WebElement> checkBox=
//        driver.findElements(By.xpath("//legend[normalize-space()='Hotel Ratings:']/following-sibling::label"));
//        
//        for(WebElement element:checkBox)
//        {
//        	element.click();
//        }
        
        List<WebElement> checkBox1=
    driver.findElements
    (By.xpath("//legend[normalize-space()='Bed Type:']/following-sibling::label"));
                
                for(WebElement element:checkBox1)
                {
                	element.click();
                }
	}

}
