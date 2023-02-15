package assignments1.Week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {
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
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Almaz");
		driver.findElement(By.id("lastNameField")).sendKeys("Nazar");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Alamz");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Nazar");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("ECE");
		driver.findElement(By.id("createContactForm_description")).sendKeys("Abc");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("abc@gmail.com");
		WebElement ele=driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select selectcreateContactForm_generalStateProvinceGeoId=new Select (ele);
		selectcreateContactForm_generalStateProvinceGeoId.selectByVisibleText("Indiana");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Create Contact");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		
	}

}
