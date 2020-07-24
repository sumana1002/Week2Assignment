package Week2Day1;

import java.util.*;

import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;


public class LaunchApplication {
	
	public static void main(String[] args) {
		
		System.setProperty ("webdriver.chrome.driver" , "C:\\Users\\suman\\OneDrive\\Documents\\TestLeaf\\Selenium\\drivers\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle()); 
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getPageSource());
		
		//Enter Username
		driver.findElementById("username").sendKeys("demosalesmanager");
		
		//Enter password
		driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		
		//Login
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
		
		driver.findElementByLinkText("Leads").click();
		
		driver.findElementByLinkText("Create Lead").click();
		
		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
		
		driver.findElementById("createLeadForm_firstName").sendKeys("Aaa");
		
		driver.findElementById("createLeadForm_lastName").sendKeys("Bbb");
	
		driver.findElementByName("submitButton").click();	
		
		//Select a dropdown - source index
		WebElement source = driver.findElementById("createLeadForm_dataSourceID");
		
		Select src = new Select(source);
		
		driver.close();
				
		
	}

}
