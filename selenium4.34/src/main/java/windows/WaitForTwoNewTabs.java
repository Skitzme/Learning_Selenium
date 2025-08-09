package windows;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForTwoNewTabs {
    public static void main(String[] args) {
        RemoteWebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Load the main page
        driver.get("https://leafground.com/window.xhtml");

        // Store the original window handles before clicking
        Set<String> originalHandles = driver.getWindowHandles();

        // Click the "Open with delay" button
        driver.findElement(By.id("j_idt88:j_idt95")).click();

        // Wait until 2 new tabs are opened (original + 2 = total 3 handles)
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
      wait.until
      ((ExpectedCondition<Boolean>)driver1->driver1.getWindowHandles().size()==originalHandles.size()+2);
      
        System.out.println("2 new tabs opened successfully!");

        // Optional: Print all window handles
        for (String handle : driver.getWindowHandles()) {
            System.out.println("Handle: " + handle);
        }

        // Close the driver
        driver.quit();
    }
}