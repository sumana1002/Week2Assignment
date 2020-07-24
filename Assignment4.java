package Week2Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {
	
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
	
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("http://leaftaps.com/opentaps/control/main");
	
	driver.manage().window().maximize();
	
	System.out.println(driver.getTitle()); 
	
	//Enter Username
	driver.findElementById("username").sendKeys("demosalesmanager");
	
	//Enter password
	driver.findElementByName("PASSWORD").sendKeys("crmsfa");
	
	//Login
	driver.findElementByClassName("decorativeSubmit").click();
	
	driver.findElementByLinkText("CRM/SFA").click();
	
	driver.findElementByLinkText("Leads").click();
	
	//Find Leads
	driver.findElementByLinkText("Find Leads").click();
	Thread.sleep(3000);
	
	driver.findElementByXPath("//span[text() = 'Email']").click();
	Thread.sleep(2000);
	
	driver.findElementByXPath("//input[@name = 'emailAddress']").sendKeys("test@mail.com");
	Thread.sleep(2000);
	
	driver.findElementByXPath("//button[text()= \"Find Leads\"]").click();
	Thread.sleep(3000);
	
	String fname = driver.findElementByXPath("//div[@class=\"x-grid3-cell-inner x-grid3-col-firstName\"]//a").getText();
	String lname = driver.findElementByXPath("//div[@class=\"x-grid3-cell-inner x-grid3-col-lastName\"]//a").getText();
	
	driver.findElementByXPath("//div[@class=\"x-grid3-cell-inner x-grid3-col-firstName\"]//a").click();
	
	driver.findElementByLinkText("Duplicate Lead").click();
	
	String title = driver.getTitle();
	System.out.println(title);
	
	String t = "Duplicate Lead | opentaps CRM";
	
	if(title.equals(t)) {
		System.out.println("Correct Title");
	}
	else
		System.out.println("Unexpected Title");
	
	driver.findElementByXPath("//input[@value = 'Create Lead']").click();
	
	String nfname = driver.findElementById("viewLead_firstName_sp").getText();
	String nlname = driver.findElementById("viewLead_lastName_sp").getText();
	
	if(fname.equals(nfname) && lname.equals(nlname)) {
		System.out.println("Same Lead name");
	}
	else
		System.out.println("Different Lead name");
	
	driver.close();
	
	}

}
