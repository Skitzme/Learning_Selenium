package learning.actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DragAndDropWithToast {
	 // Reusable method to get toast message
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
        driver.get("https://leafground.com/drag.xhtml"); // Replace with the actual page URL

        Actions actions = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            // Dragging rows
            WebElement fromEle = driver.findElement(By.xpath("(//tr[@data-ri='9'])[last()]"));
            WebElement toEle = driver.findElement(By.xpath("(//tr[@data-ri='0'])[last()]"));
            actions.dragAndDrop(fromEle, toEle).build().perform();

            // Get row toast message
            String rowToast = getToastMessage(driver, wait);
            System.out.println("Row Toast Message: " + rowToast);

            // Dragging columns
            WebElement nameEle = driver.findElement(By.xpath("//th[contains(@id,'form:j_idt94:j_idt95')]"));
            WebElement quantityEle = driver.findElement(By.xpath("//th[contains(@id,'form:j_idt94:j_idt99')]"));
            actions.dragAndDrop(nameEle, quantityEle).perform();

            // Get column toast message
            String colToast = getToastMessage(driver, wait);
            System.out.println("Column Toast Message: " + colToast);

        } finally {
            driver.quit();
        }
    }

   
}
