package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {
	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		String text=driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Nevil");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Nevil");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Tester");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("100000");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("010");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("TestCase");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("ImportantNotes");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Raj");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Raj");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Ece");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("10");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("**");
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("91");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("5");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("9876543210");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9876543210");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("URL");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Nevil");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Address");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("010");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("011");
		
		
		
	}

}
