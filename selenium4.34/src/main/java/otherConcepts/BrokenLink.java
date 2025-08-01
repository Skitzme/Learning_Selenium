package otherConcepts;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrokenLink {

	public static void main(String[] args) throws IOException {
		RemoteWebDriver driver=new ChromeDriver();
		//List<String> links1=new ArrayList<>();

		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/status_codes");
		List<WebElement> links=driver.findElements(By.xpath("//a"));
		System.out.println("Total links: " +links.size());

		for(WebElement link:links)
		{
			String val=link.getDomAttribute("href");


			URL base = new URL(driver.getCurrentUrl()); // Get the page's base URL
			URL fullUrl = new URL(base, val);          // Join base + relative
			HttpURLConnection con=(HttpURLConnection) fullUrl.openConnection();
			con.setConnectTimeout(5000);
			con.connect();
			int statuscode=con.getResponseCode();

			if( statuscode>=400)
			{
				System.out.println(" the links are broken: " + val );
			}

		}

		driver.quit();
	}

}
