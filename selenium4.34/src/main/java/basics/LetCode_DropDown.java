package basics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LetCode_DropDown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://letcode.in/dropdowns");
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement dropdwonBox=	driver.findElement(By.id("fruits"));

		/*
		 * Select select=new Select(dropdwonBox); Boolean status= select.isMultiple();
		 * System.out.println(status); select.selectByVisibleText("Apple"); WebElement
		 * firstElemet= select.getFirstSelectedOption();
		 * System.out.println(firstElemet.getText());
		 */
		
		/*
		 * WebElement superHeros= driver.findElement(By.id("superheros")); Select
		 * select=new Select(superHeros);
		 * 
		 * Boolean status1=select.isMultiple(); if(status1==true) {
		 * select.selectByIndex(0); select.selectByValue("sm");
		 * select.selectByVisibleText("Thor");
		 * select.selectByContainsVisibleText("Woman"); select.selectByIndex(2);
		 * select.selectByIndex(5);
		 * 
		 * List<WebElement>selectedOptions= select.getAllSelectedOptions(); int
		 * size=selectedOptions.size();
		 * 
		 * for(int i=0; i<size; i++) { System.out.println("the selected options are: " +
		 * selectedOptions.get(i).getText()); } } else {
		 * System.out.println("it is not mulitple so select one element only at a time"
		 * ); select.selectByIndex(0); } select.deselectByIndex(0);
		 * select.deselectByValue("sm"); select.deselectByVisibleText("Thor");
		 * select.deSelectByContainsVisibleText("Woman"); select.deselectByIndex(2);
		 * select.deselectByIndex(5);
		 * 
		 * List<WebElement>selectedOptions1= select.getAllSelectedOptions();
		 * System.out.println(selectedOptions1.size());
		 */
		
	WebElement languages=	driver.findElement(By.id("lang"));
	Select select=new Select(languages);
	List<WebElement> allLang=	select.getOptions();
	int size=allLang.size(); //
	
	for(int i=0; i<size;i++)
	{
		System.out.println(" the values are: " + allLang.get(i).getText());
		if(i==size-1)
		{
			select.selectByIndex(i);
			System.out.println(select.getFirstSelectedOption().getText());
		}
	}
	driver.quit();
}
		
		
		
		
		

		


	}


