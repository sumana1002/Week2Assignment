package Week2Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LinkPage {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty ("webdriver.chrome.driver" , "C:\\Users\\suman\\OneDrive\\Documents\\TestLeaf\\Selenium\\drivers\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://leafground.com/pages/Link.html");
		
		driver.manage().window().maximize();
		
		driver.findElementByLinkText("Go to Home Page").click();
		Thread.sleep(3000);
		
		driver.navigate().back();
		Thread.sleep(3000);
		
		driver.findElementByPartialLinkText("Find where am supposed");
		
		driver.navigate().to("http://leafground.com/pages/Button.html");
		Thread.sleep(3000);
		
		driver.navigate().back();
		Thread.sleep(3000);
		
		driver.findElementByPartialLinkText("Verify").click();
		
		String str = driver.getTitle();
		System.out.println(str);
		
		if(str.equals("HTTP Status 404 – Not Found"))
		{		
		System.out.println("Broken");
		}
		else 
		{
		System.out.println("Not broken");
		}
		
		driver.navigate().back();
		Thread.sleep(3000);		
				
		driver.get("http://leafground.com/pages/Link.html");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		driver.close();
	
	}
}
