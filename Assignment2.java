package Week2Assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
	
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
		
		//Search
		//driver.findElementByXPath("//input[@class =\' x-form-text x-form-field \' and @name = \'firstName\']").sendKeys("Aaa");
		driver.findElementByXPath("(//span[text()='Advanced']/following::input)[2]").sendKeys("Aaa");
		Thread.sleep(3000);
		
		//Enter
		driver.findElementByXPath("//button[text()= \"Find Leads\"]").click();
		Thread.sleep(3000);
		
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a").click();	
		Thread.sleep(3000);
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		String t = "View Lead | opentaps CRM";
		
		if(title.equals(t))
		{
			System.out.println("Expected Title");
		}
		else
			System.out.println("Unexpected Title");
		
		driver.findElementByXPath("//a[text() = 'Edit']").click();
		
		driver.findElementById("updateLeadForm_companyName").clear();
		Thread.sleep(2000);
		
		driver.findElementById("updateLeadForm_companyName").sendKeys("New Company");
		Thread.sleep(2000);
		
		String nc = driver.findElementById("updateLeadForm_companyName").getAttribute("value");
		
		driver.findElementByXPath("//input[@name ='submitButton' and @value = 'Update']").click();
		
		String ncupdated = driver.findElementByXPath("//span[@id ='viewLead_companyName_sp']").getText();
		
		System.out.println(ncupdated);
		
		if(nc.equals(ncupdated))
		{
			System.out.println(nc);
		}
		else
			System.out.println("Comapany name mismatch");
		
		driver.close();
}
}