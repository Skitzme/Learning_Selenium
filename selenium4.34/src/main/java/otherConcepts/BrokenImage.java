package otherConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrokenImage {
//pascalcase
	public static void main(String[] args) {
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/broken_images");
		List<WebElement> imgEle=driver.findElements(By.xpath("//div[@class='example']/child::img"));
		for(WebElement img:imgEle)
		{
			String value=img.getAttribute("naturalWidth");
			if(value.equals("0"))
			{
				System.out.println
				("broke image value is "+ value + " the broken image is " + img.getDomAttribute("src"));
			}
			
			else
			{
				System.out.println
				(" non broken image value is: " + value + "the non broken image " + img.getDomAttribute("src"));
			}
		}
	}

}
