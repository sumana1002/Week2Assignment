package Week2Assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty ("webdriver.chrome.driver" , "C:\\Users\\suman\\OneDrive\\Documents\\TestLeaf\\Selenium\\drivers\\chromedriver.exe");
		
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
		
		driver.findElementByXPath("//span[text() = 'Phone']").click();
		
		driver.findElementByXPath("//input[@name='phoneCountryCode']").clear();
		Thread.sleep(2000);
		driver.findElementByXPath("//input[@name='phoneCountryCode']").sendKeys("91");
		Thread.sleep(2000);
		driver.findElementByXPath("//input[@name='phoneAreaCode']").sendKeys("40");
		Thread.sleep(2000);
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("9988998899");
		Thread.sleep(2000);
		driver.findElementByXPath("//button[text()= \"Find Leads\"]").click();
		Thread.sleep(3000);
		
		String leadid = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a").getText();
		System.out.println(leadid);
		
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a").click();
		
		driver.findElementByXPath("//a[text() = 'Delete']").click();
		
		driver.findElementByLinkText("Find Leads").click();
		Thread.sleep(2000);
		
		driver.findElementByXPath("//span[text()='Advanced']/following::input").sendKeys(leadid);
		Thread.sleep(2000);
		
		driver.findElementByXPath("//button[text()= \"Find Leads\"]").click();
		Thread.sleep(2000);
		
		String cnfrmmsg = driver.findElementByXPath("//div[@class='x-paging-info']").getText();
		System.out.println(cnfrmmsg);
		
		driver.close();
		
	}

}
