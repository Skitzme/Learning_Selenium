package learning.actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

public class ResizeImage {
	public static String getToastMessage(WebDriver driver, WebDriverWait wait) {
        By toastLocator = By.xpath("//div[contains(@class,'ui-growl-message')]");

        // Ensure old toast (if present) is gone
        try {
            wait.until(ExpectedConditions.invisibilityOfElementLocated(toastLocator));
        } catch (Exception e) {
            // Ignore - might not be visible initially
        }

        // Wait for the new toast to appear
        WebElement toastMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(toastLocator));
        String message = toastMessage.getText();
        // Optionally wait for the toast to disappear (auto-dismiss)
        try {
            wait.until(ExpectedConditions.invisibilityOfElementLocated(toastLocator));
        } catch (Exception e) {
            // Ignore if toast does not disappear automatically
        }
       

        return message;
    }
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://leafground.com/drag.xhtml"); // Replace with actual URL

        // Locate the resize handle
        WebElement resizeHandle = driver.findElement(By.xpath("//div[contains(@class,'ui-resizable-e')]"));

        // Scroll into view
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", resizeHandle);

        // Resize with smaller offset
        Actions actions = new Actions(driver);
        actions.moveToElement(resizeHandle)
               .clickAndHold()
               .moveByOffset(20, 10) // Adjust offsets to avoid out-of-bounds
               .release()
               .perform();
        
        String resizeMsg=getToastMessage(driver, wait);
        System.out.println("Resize info: "+resizeMsg);
       
       driver.quit();
    }
}


