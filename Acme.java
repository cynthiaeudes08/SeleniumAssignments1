package assignment2.Week2;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Acme {
	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://acme-test.uipath.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.id("password")).sendKeys("leaf@12");
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Log Out")).click();
		
		
	}

}
