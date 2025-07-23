package learning.actionsClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RangeSlider {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://leafground.com/drag.xhtml");  

        Actions actions = new Actions(driver);

        // Locate left and right handles
        WebElement leftHandle = driver.findElement(By.xpath("(//span[contains(@class,'ui-slider-handle')])[1]"));
        WebElement rightHandle = driver.findElement(By.xpath("(//span[contains(@class,'ui-slider-handle')])[2]"));
        
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",leftHandle);
        // Move left handle (e.g., drag to the right by 50px)
        actions.dragAndDropBy(leftHandle, 50, 0).perform();
        Thread.sleep(1000);

        // Move right handle (e.g., drag to the left by -30px)
        actions.dragAndDropBy(rightHandle, -30, 0).perform();
        Thread.sleep(1000);

        //driver.quit();
    }
}
