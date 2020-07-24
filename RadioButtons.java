package Week2Assignment;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {
	
	public static void main(String[] args) {
		
		System.setProperty ("webdriver.chrome.driver" , "C:\\Users\\suman\\OneDrive\\Documents\\TestLeaf\\Selenium\\drivers\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://leafground.com/pages/radio.html");
		
		driver.manage().window().maximize();
		
		driver.findElementByXPath("//input[@class = \"myradio\" and @id= \"yes\"]").click();
		
		List<WebElement> radio = driver.findElements(By.name("news"));
		System.out.println(radio.size());
		
		for(int i =0; i<= radio.size(); i++) {
		boolean def = radio.get(i).isSelected();
		if(def == true) {
		
			WebElement loc = radio.get(i);
			String value = loc.getAttribute("text");
			System.out.println("default value is " + value);
			
				}
		}
		driver.close();
	}
}
