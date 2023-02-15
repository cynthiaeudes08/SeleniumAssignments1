package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLeadXpath {
	public static void main(String[] args) {
		//launch the browser
		EdgeDriver driver=new EdgeDriver();
		//Load the URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		//Maximize the browser
		driver.manage().window().maximize();
		//Enter the User name and password
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
        driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
        driver.findElement(By.xpath("//a[contains (text(),'CRM/SFA')]")).click();
        driver.findElement(By.xpath("//a[contains (text(),'Create Lead')]")).click();
        driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("ABC");
        driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Nelciya");
        driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Golda");
        driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Nelicya");
        driver.findElement(By.xpath("//input[@id='createLeadForm_lastNameLocal']")).sendKeys("Golda");
        driver.findElement(By.xpath("//input[@id='createLeadForm_personalTitle']")).sendKeys("Miss");
        driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("ECE");
        driver.findElement(By.xpath("//input[@id='createLeadForm_annualRevenue']")).sendKeys("10000");
        driver.findElement(By.xpath("//input[@id='createLeadForm_numberEmployees']")).sendKeys("10");
        driver.findElement(By.xpath("//input[@id='createLeadForm_sicCode']")).sendKeys("000");
        driver.findElement(By.xpath("//input[@id='createLeadForm_tickerSymbol']")).sendKeys("010");
        driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneCountryCode']")).sendKeys("91");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneAreaCode']")).sendKeys("5");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneExtension']")).sendKeys("9876543210");
		driver.findElement(By.xpath("//input[@id=createLeadForm_primaryEmail']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@id=createLeadForm_primaryPhoneNumber']")).sendKeys("9876543210");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryWebUrl']")).sendKeys("URL");
		driver.findElement(By.xpath("//input[@id='createLeadForm_generalToName']")).sendKeys("Nevil");
		driver.findElement(By.xpath("//input[@id='createLeadForm_generalAddress1']")).sendKeys("Address");
		driver.findElement(By.xpath("//input[@id='createLeadForm_generalCity']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//input[@id='createLeadForm_generalPostalCode']")).sendKeys("010");
		driver.findElement(By.xpath("//input[@id='createLeadForm_generalPostalCodeExt']")).sendKeys("011");
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='createLeadForm_marketingCampaignId']"));
		Select selectoptions=new Select(dropdown);
		List<WebElement> options = selectoptions.getOptions();
		for (int i = 0; i < options.size(); i++) {
			String text=options.get(i).getText();
			System.out.println(text);
			
		}
        
	}

}
