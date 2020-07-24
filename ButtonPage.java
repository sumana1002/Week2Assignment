package Week2Assignment;

import java.util.*;
import java.awt.*;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

public class ButtonPage {
	
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty ("webdriver.chrome.driver" , "C:\\Users\\suman\\OneDrive\\Documents\\TestLeaf\\Selenium\\drivers\\chromedriver.exe");

	ChromeDriver driver = new ChromeDriver();
	
	driver.navigate().to("http://leafground.com/pages/Edit.html");
	
	driver.manage().window().maximize();
	
	driver.findElementById("email").sendKeys("sumana.polavarapu@gmail.com");
	
	//String str= driver.findElementByXPath("//input[@value=\"Append \"]").getAttribute("value");
	//System.out.println(str);
	
	driver.findElementByXPath("//input[@value=\"Append \"]").sendKeys("AppendedText");
	Thread.sleep(3000);
	
	driver.findElementByXPath("//input[@value=\"Append \"]").sendKeys(Keys.TAB);
	
	System.out.println(driver.findElementByName("username").getAttribute("value"));
	Thread.sleep(3000);
	
	driver.findElementByXPath("//input[@name = \"username\" and @value = \"Clear me!!\"]").clear();
	Thread.sleep(3000);
	
	System.out.println(driver.findElementByXPath("//input[@disabled=\"true\"]").isEnabled());
	
	//driver.close();
	
	}

}
