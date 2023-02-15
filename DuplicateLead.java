package assignments1.Week2;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class DuplicateLead {

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
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		driver.findElement(By.linkText("Almaz")).click();
		System.out.println("Title is: "+ driver.getTitle());
		String teString = driver.findElement(By.xpath("(//span[text()='Almaz'])[1]")).getText();
		System.out.println("First name : "+ teString);
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		String text2 = driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
	    System.out.println(text2);
	    driver.findElement(By.xpath("//input[@name='submitButton']")).click();
	    driver.close();

	}

}
